SUMMARY = "A variable-width \\parbox command"
DESCRIPTION = "Defines a command \\pbox{<max width>}{<text>} which adjusts its \
width to that of the enclosed text, up to the maximum width \
given. The package also defines some associated length \
commands."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-pbox-2026.226.1.2svn77682-58.2.noarch.rpm"
RPM_HASH = "85e0bbf34dcf2f2152799f44d7c25ac1f7566a4f0602ab09f23b35adeae1eab59551209f2768c7d89cb441467dfb72149940efde6940ec0eb806ccf739059abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbox.sty \
texlive-pbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
