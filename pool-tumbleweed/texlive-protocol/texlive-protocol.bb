SUMMARY = "A class for minutes of meetings"
DESCRIPTION = "The present version of the class supports German meeting \
minutes including vote results and action items. The author has \
ambitions to internationalise the code, and would welcome \
support in the work."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn25562"

RPM_NAME = "texlive-protocol-2026.226.1.13svn25562-59.2.noarch.rpm"
RPM_HASH = "0d6cc1ba96658983852d43af201d4bf4f255bf55a87fec6f73e8dce468beb3dab28f75295b02b7d081087c9624a3435993cec2e5beb73cbb22100385cd8b256e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-protocol.cls \
texlive-protocol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrartcl.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
