SUMMARY = "Typeset laboratory journals"
DESCRIPTION = "This class is designed to typeset laboratory journals that \
contain chronologically ordered records about experiments. From \
the sectioning commands, an experiment index is generated. The \
class is based on the KOMA-Script class scrbook.cls. There can \
be several index entries for one experiment."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-labbook-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "9f770bf20310d7db55d992252484754ecdc575edf70e206e68c73c1761196bd7ba910e6c712e178fad4358a1d86183d4992611d40e03b765a332a6d03ffe331e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labbook.cls \
texlive-labbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
tex-scrbook.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
