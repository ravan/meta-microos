SUMMARY = "Multi-column enumerated lists"
DESCRIPTION = "Defines an environment multienumerate, that produces an \
enumerated array in which columns are vertically aligned on the \
counter. The motivation was lists of answers for a text book, \
where there are many rather small items; the multienumerate \
environment goes some way to making such lists look neater."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-multenum-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "a2590cf43ebce9f64fa21b5afe34e175e2d9581b9e883a1b925aeff6660ddf6692fb94e92143ffe99268ced746510e0766deb4a709c1676c2f4e1de3854ff7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multienum.sty \
texlive-multenum"

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
