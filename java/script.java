// Clean Dark Mode Toggle
function toggleDarkMode() {
    document.body.classList.toggle('dark-mode');
    const btns = document.querySelectorAll('#darkModeBtn');
    const isDark = document.body.classList.contains('dark-mode');
    
    btns.forEach(btn => {
        btn.textContent = isDark ? '☀️ Light' : '🌙 Dark';
    });
    localStorage.setItem('darkMode', isDark);
}

// Init
document.addEventListener('DOMContentLoaded', function() {
    // Load saved theme
    if (localStorage.getItem('darkMode') === 'true') {
        document.body.classList.add('dark-mode');
        document.querySelectorAll('#darkModeBtn').forEach(btn => {
            btn.textContent = '☀️ Light';
        });
    }
    
    // Hero cards
    document.querySelectorAll('.card').forEach(card => {
        card.addEventListener('click', function() {
            const hero = this.dataset.hero;
            if (hero) window.location.href = `article.html?hero=${hero}`;
        });
    });
});