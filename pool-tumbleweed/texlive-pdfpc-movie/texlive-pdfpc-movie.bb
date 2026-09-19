SUMMARY = "Pdfpc viewer-compatible hyperlinks to movies"
DESCRIPTION = "This LaTeX2e package provides a command \\pdfpcmovie for \
embedding (hyperlinking) movies in a way compatible with the \
PDF Presenter Console (pdfpc), a GPL2-licensed multi-monitor \
PDF presentation viewer application available on GitHub and \
shipped with some LINUX distributions such as Debian, Fedora, \
and Arch. The package depends on etoolbox, hyperref, and \
pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67201"

RPM_NAME = "texlive-pdfpc-movie-2026.226.1.0svn67201-58.2.noarch.rpm"
RPM_HASH = "5c9bc66e2ab7ea21fd4bc13fab7d029f2026c65d1292a23e8691b43583c43b14a449930b448cfe52515dbf52ec7cff65526a0e189cacc645e5d33d5bc3e1dee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpc-movie.sty \
texlive-pdfpc-movie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
