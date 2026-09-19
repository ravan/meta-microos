SUMMARY = "Converter from LaTeX to ebook formats"
DESCRIPTION = "This is a bundle of Lua scripts and LaTeX packages for \
conversion of LaTeX files to ebook formats such as epub, mobi \
and epub3. tex4ht is used as the conversion engine."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.4dsvn78132"

RPM_NAME = "texlive-tex4ebook-2026.227.0.0.4dsvn78132-62.2.noarch.rpm"
RPM_HASH = "78488a07839b4b6ba6a675ac4379821a6ecdf71e45806ef47fd0a08d0886b2043bbeeeb3b54b0dddacba23c06a4292321e586a5c8a8fc9e860952934ecfcc92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tex4ebook.sty \
texlive-tex4ebook"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-make4ht \
texlive-scripts \
texlive-scripts-bin \
texlive-tex4ebook-bin \
texlive-tex4ht"

inherit rpm
