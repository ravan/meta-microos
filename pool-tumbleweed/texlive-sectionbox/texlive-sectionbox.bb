SUMMARY = "Create fancy boxed ((sub)sub)sections"
DESCRIPTION = "Sectionbox is a LaTeX package for putting fancy colored boxes \
around sections, subsections, and subsubsections, especially \
for use in posters, etc. It was designed with the sciposter \
class in mind, and certainly works with that class and with \
derived classes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn37749"

RPM_NAME = "texlive-sectionbox-2026.226.1.01svn37749-60.2.noarch.rpm"
RPM_HASH = "8174a0f6400ce92758181a4ca7c01f9777c98125caeed5eaeeb44636515c9066ffe5b92df9385d58d4f6b9c5819e1384f6788fa72910153ebf567f2c541d8411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sectionbox.sty \
texlive-sectionbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-fancybox.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
