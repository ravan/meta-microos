SUMMARY = "Documentation support for C, Java and assembler code"
DESCRIPTION = "The package provides a simple means of typesetting computer \
programs such that the result is acceptable for inclusion in \
reports, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34521"

RPM_NAME = "texlive-documentation-2026.226.0.0.1svn34521-59.2.noarch.rpm"
RPM_HASH = "f3a4dff68bd671b3c961366b779c85c0e9ae5a61c7926602b922e131635ea2876a64c2bbdd3813ca8a6783a6fb7a113ab1e6b1c454e4dec8041aa44802f0793d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-documentation.sty \
texlive-documentation"

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
