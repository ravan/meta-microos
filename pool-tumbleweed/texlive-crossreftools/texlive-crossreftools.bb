SUMMARY = "Expandable extraction of cleveref data"
DESCRIPTION = "This package extracts information from cross-referencing \
labels, especially those from cleveref, in an expandable \
manner."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-crossreftools-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "317e19a6cf3e2b1bb578ba17b4104703735ee095578572745a389a9504173572a5713d33f5b53eeeca060dc9fbcc41c500e456dc0d841acd78a01a3ed9db718f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crossreftools.sty \
texlive-crossreftools"

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
