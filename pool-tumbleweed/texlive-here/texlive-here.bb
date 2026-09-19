SUMMARY = "Emulation of obsolete package for 'here' floats"
DESCRIPTION = "Provides the H option for floats in LaTeX to signify that the \
environment is not really a float (and should therefore be \
placed 'here' and not float at all). The package emulates an \
older package of the same name, which has long been suppressed \
by its author. The job is done by nothing more than loading the \
float package, which has long provided the option in an \
acceptable framework."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn16135"

RPM_NAME = "texlive-here-2026.226.svn16135-60.4.noarch.rpm"
RPM_HASH = "bb6266a3e6a7a4d039d117d11f9be3389a659dbd86decc5c2b982254ba29bf2473e8d5026da4a2e762d849870ef91ad838af437d0b9ef5700ab6ae8bb26f97c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-here.sty \
texlive-here"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
