SUMMARY = "Select alternative section titles"
DESCRIPTION = "A package providing an interface to sectioning commands for \
selection from various title styles. E.g., marginal titles and \
to change the font of all headings with a single command, also \
providing simple one-step page styles. Also includes a package \
to change the page styles when there are floats in a page. You \
may assign headers/footers to individual floats, too."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.17svn77682"

RPM_NAME = "texlive-titlesec-2026.226.2.17svn77682-59.2.noarch.rpm"
RPM_HASH = "0086d9f82bcfe2c07269ce07110abaa343b5028707fe10aab7e72cf1a0b4223b7af9bda567b5aa8e031a66b0b878ba4db9885462c25265fb2e5f2b1eb7bad395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titleps.sty \
tex-titlesec.sty \
tex-titletoc.sty \
texlive-titlesec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
