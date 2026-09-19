SUMMARY = "Comprehensive letter support"
DESCRIPTION = "An advanced letter document class which extends LaTeX's usual \
letter class, providing support for building your own \
letterhead and marking fold points for window envelopes. \
Options supported by the package include: letterpaper for US \
letter; a4offset for a modified A4 layout suitable for platic \
binders that cover a part of the left margin. The class's \
handling of dates has inspired an extended version of \
date-handling in the isodate package. The class supersedes an \
earlier class called myletter."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5isvn15878"

RPM_NAME = "texlive-akletter-2026.226.1.5isvn15878-61.2.noarch.rpm"
RPM_HASH = "50419c0cc059d8030357c049a1c9c3912a9c1b73568a7043ddd6b1012331edf56b95c6e0660ddd938b6ab5f121f84be4466a265f04ebed08dd23709bfe6a1f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-akfax.cfg \
tex-akletter.cfg \
tex-akletter.cls \
tex-myletter.cls \
texlive-akletter"

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
