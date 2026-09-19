SUMMARY = "Print Steinmetz notation"
DESCRIPTION = "The steinmetz package provides a command for typesetting \
complex numbers in the Steinmetz notation used in \
electrotechnics as: <modulus>;<argument or phase inside an \
angle symbol> The package makes use of pict2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-steinmetz-2026.226.1.0svn77682-64.2.noarch.rpm"
RPM_HASH = "bbb409067f4c409a24111b967b0e0f28ca5266f334db25aa3c43b3525c427e87d47c450dddddcf20664585229a7c951b1433ad1ca3a5771e7822f84984a4fd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-steinmetz.sty \
texlive-steinmetz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
