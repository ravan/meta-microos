SUMMARY = "Allow line breaks within \\verb and verbatim output"
DESCRIPTION = "LaTeX's \\verb macro treats its argument as an unbreakable unit \
of text. This can lead to poor typesetting, especially when the \
argument is long. The spverbatim package provides an \\spverb \
macro that is analogous to \\verb and an spverbatim environment \
that is analogous to verbatim with the difference being that \
\\spverb and spverbatim allow LaTeX to break lines at space \
characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-spverbatim-2026.226.1.0svn77682-64.2.noarch.rpm"
RPM_HASH = "3f08a57a85f7a27b799ffd110b8cb2cc5767c0361c64666de60f4f56cf187660bd96ebb08f4a86fa195ad2349408f36ae3a656bbf12271016fc722461af93247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spverbatim.sty \
texlive-spverbatim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
