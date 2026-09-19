SUMMARY = "A Lua script running LaTeX document files with TeX-style shebang"
DESCRIPTION = "In short, a TeX-style shebang (%#!) is a special kind of TeX \
comment that you include in your TeX/LaTeX document file to \
tell the operating system's shell how to run the file for the \
rest of the file: %#!lualatex foo.tex \\documentclass{article} \
\\begin{document} Hello, {\\LaTeX} World! Happy {\\TeX}ing. \
\\end{document} If you are using a TeX-style shebang, it must \
appear on the line that matched 20 lines or less in your LaTeX \
document, and it has to start with a TeX comment symbol (%) \
followed by a hash sign (#) and an exclamation mark (!), \
colloquially known as the bang, hence the name shebang for \
TeX/LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn68882"

RPM_NAME = "texlive-runtexshebang-2026.226.0.0.5svn68882-60.2.noarch.rpm"
RPM_HASH = "2168d68202309f02660faf0d38328d7c3fd0f7eb49080794fa593e78a1986102a1fe63d30d0da29e6f40e6958eb9df8a8de3a9f0ae16885383498a4d064e154e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-runtexshebang"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-runtexshebang-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
