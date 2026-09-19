SUMMARY = "Table heads with diagonal lines"
DESCRIPTION = "The package's principal command, \\diagbox, takes two arguments \
(texts for the slash-separated parts of the box), and an \
optional argument with which the direction the slash will go, \
the box dimensions, etc., may be controlled. The package also \
provides \\slashbox and \\backslashbox commands for compatibility \
with the slashbox package, which it supersedes. diagbox depends \
on e-TeX as well as the packages array, calc, fp, keyval, and \
pict2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-diagbox-2026.226.2.4svn77682-59.2.noarch.rpm"
RPM_HASH = "354cddbc5f9ac464a83fa3c8cea5b5ca6af2c19c0da186115f10e3782d1abd15d902a90129937ee3f418ec3e57fa5aeea8f0cd4acce3277e48ebbc593ecbd885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagbox.sty \
texlive-diagbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-fp.sty \
tex-keyval.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
