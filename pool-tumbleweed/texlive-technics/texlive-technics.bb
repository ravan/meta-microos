SUMMARY = "A package to format technical documents"
DESCRIPTION = "The package provides a very simple LaTeX document template, in \
the hope that this use of LaTeX will become attractive to \
typical word processor users. (Presentation is as if it were a \
class; users are expected to start from a template document.)"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn29349"

RPM_NAME = "texlive-technics-2026.227.1.0svn29349-62.2.noarch.rpm"
RPM_HASH = "1560b8af96c9bb8a727a0ad9402b1db61a9007fe4784436db0c09c1a99e9f87f40d5739a0ba5e3d23bf87edca558e6bd6d89c41003259dae52fd8f93822f097f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-technics.sty \
texlive-technics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-calc.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-graphics.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-multicol.sty \
tex-setspace.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
