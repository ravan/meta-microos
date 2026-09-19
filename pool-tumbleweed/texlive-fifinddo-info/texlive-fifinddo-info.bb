SUMMARY = "German HTML beamer presentation on nicetext and morehype"
DESCRIPTION = "The bundle: exhibits the process of making an 'HTML beamer \
presentation' with the blogdot package from the morehype \
bundle, and HTML generation based on the fifinddo package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn29349"

RPM_NAME = "texlive-fifinddo-info-2026.226.1.1bsvn29349-59.2.noarch.rpm"
RPM_HASH = "eda002a5f41d57174368ea2f418a4d8094cdd28eaafe9facfbbad125c352edc2a361f2c3ea2a1edc56a14e93850949298b74d74dd23dc3f22065471ef418b4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fifinddo-info"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
