SUMMARY = "YaST2 - Oxygen icon theme"
DESCRIPTION = "Contains icons in KDE Oxygen style (from KDE Plasma 4)."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-theme-oxygen-5.0.2-1.2.noarch.rpm"
RPM_HASH = "83ef9ab70929768940ba20cae466607f8318bf8bbe45f0fb0a2b3b72fce5555c0919692adcf2fc0e62a84f872e620b65beb4c9f3c8d3a65c96d761b56b8424f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-theme-oxygen"

RDEPENDS:${PN} += "oxygen5-icon-theme \
yast2-branding"

inherit rpm
