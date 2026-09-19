SUMMARY = "Produce 'outline' lists"
DESCRIPTION = "Defines an outline environment, which allows outline-style \
indented lists with freely mixed levels up to four levels deep. \
It replaces the nested begin/end pairs by different item tags \
\\1 to \\4 for each nesting level. This is very convenient in \
cases where nested lists are used a lot, such as for to-do \
lists or presentation slides."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-outlines-2026.226.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "8cc5e6f3f3b20be98754223eff5efdadbdc4022a76910058a1237bc76e1b8ea0a74049a688b21782a7e5321c66a4c0b6e47ffe732aafeea371254a89a47170c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outlines.sty \
texlive-outlines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
