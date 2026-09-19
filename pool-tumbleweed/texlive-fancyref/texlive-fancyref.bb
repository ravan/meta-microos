SUMMARY = "A LaTeX package for fancy cross-referencing"
DESCRIPTION = "Provides fancy cross-referencing support, based on the \
package's reference commands (\\fref and \\Fref) that recognise \
what sort of object is being referenced. So, for example, the \
label for a \\section would be expected to be of the form \
'sec:foo': the package would recognise the 'sec:' part."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9csvn77682"

RPM_NAME = "texlive-fancyref-2026.226.0.0.9csvn77682-59.2.noarch.rpm"
RPM_HASH = "f51d7b65e418bca7716e306cd35dc1218c79a0aebb7142e0a8af4a06e7e7ebfd6683c887b2d86c2b4fde9d6a0b021c2f722d8085e23d5a0d74b5a34c3e3ed842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyref.sty \
texlive-fancyref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
