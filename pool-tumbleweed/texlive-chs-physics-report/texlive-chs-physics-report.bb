SUMMARY = "Physics lab reports for Carmel High School"
DESCRIPTION = "This package may optionally be used by students at Carmel High \
School in Indiana in the United States to write physics lab \
reports for FW physics courses. As many students are beginners \
at LaTeX, it also attempts to simplify the report-writing \
process by offering macros for commonly used notation and by \
automatically formatting the documents for students who will \
only use TeX for mathematics and not typesetting. The package \
depends on amsmath, calc, fancyhdr, geometry, graphicx, \
letltxmacro, titlesec, transparent, and xcolor."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-chs-physics-report-2026.226.svn54512-60.2.noarch.rpm"
RPM_HASH = "6fc7ddc73892eab26ebee176245d73c208599b18067fe2a5b9e0c1c9c12363c8b8e596924673576acd77f183f20cab8dd6de1aeeb62b29b772a72841a09558b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chs-physics-report.sty \
texlive-chs-physics-report"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-letltxmacro.sty \
tex-titlesec.sty \
tex-transparent.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
