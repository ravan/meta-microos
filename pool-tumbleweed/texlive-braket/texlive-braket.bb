SUMMARY = "Dirac bra-ket and set notations"
DESCRIPTION = "Provides macros to typeset bra-ket notation, as well as set \
specifiers, with a single ('|') or a double ('||' or ('\\|') \
vertical bar specifier in between two bracketed parts. Each \
macro comes in a fixed-size version and an expanding version. \
If the package finds itself operating under e-tex, it uses the \
extended primitive \\middle for more reliable results"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-braket-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "f1eee26322f51fa6cd1de5a96cc8b735f63c6afc845bd5da21ace4a85c11d24952a48ffddad800636d7ce0fa1ad3a61c1cc0b71f4ebd70b3edccae14d7edf1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-braket.sty \
texlive-braket"

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
