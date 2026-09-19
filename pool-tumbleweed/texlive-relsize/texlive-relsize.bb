SUMMARY = "Set the font size relative to the current font size"
DESCRIPTION = "The basic command of the package is \\relsize, whose argument is \
a number of \\magsteps to change size; from this are defined \
commands \\larger, \\smaller, \\textlarger, etc."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.1svn77682"

RPM_NAME = "texlive-relsize-2026.226.4.1svn77682-60.4.noarch.rpm"
RPM_HASH = "d3fc0a576f03b0a11a7a4e8394bbab69358f25f978cd94956f21a8b852a62c888cd1adb4ad42b972c95f8c5adc5706609c6aa98c0e132e640a561ff440af0a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-relsize.sty \
texlive-relsize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-type1cm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
