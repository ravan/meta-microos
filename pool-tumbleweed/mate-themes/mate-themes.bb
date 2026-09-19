SUMMARY = "Themes for the MATE desktop"
DESCRIPTION = "Official themes for the MATE desktop \
 \
This package contains the official desktop themes of the MATE \
desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.26"

RPM_NAME = "mate-themes-3.22.26-1.7.noarch.rpm"
RPM_HASH = "b4f329cd684415951982b31f66aec78c1c37adb4d047ff8527a1640cd1dead655d58e95e2b45daa217cdaec93b897785adc1b2b9d6665127b0350a048c93a346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-themes"

RDEPENDS:${PN} += "gtk2-engine-clearlooks \
gtk2-engine-hcengine \
gtk2-engine-murrine"

inherit rpm
