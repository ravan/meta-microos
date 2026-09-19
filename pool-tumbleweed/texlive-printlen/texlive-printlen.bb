SUMMARY = "Print lengths using specified units"
DESCRIPTION = "\\printlength{length} prints the value of a LaTeX length in the \
units specified by \\uselengthunit{unit} ('unit' may be any TeX \
length unit except for scaled point, viz., any of: pt, pc, in, \
mm, cm, bp, dd or cc). When the unit is pt, the printed length \
value will include any stretch or shrink; otherwise these are \
not printed. The 'unit' argument may also be PT, in which case \
length values will be printed in point units but without any \
stretch or shrink values."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-printlen-2026.226.1.1asvn77682-59.2.noarch.rpm"
RPM_HASH = "739dd86fd8706e30b340acad2716c72b8054138b94a72dfb1a315989f2ad77bc7a9e98c27376419ebc9af261262842f57b925222928e22a8a91ef83d74258e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-printlen.sty \
texlive-printlen"

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
