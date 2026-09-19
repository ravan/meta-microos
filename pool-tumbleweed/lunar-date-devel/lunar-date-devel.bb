SUMMARY = "Chinese Lunar calendar library development files"
DESCRIPTION = "Development files for Chinese Lunar calendar library"
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-date-devel-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "808bd0ef04848187b542188f10412de52415ee18bb485bdaf664377ccb36f069a897d2bfb79deb0256fa912d030ebd7207dfd92b830e552b96288ab0dd83cc39"

RPROVIDES:${PN} += "lunar-date-devel \
pkgconfig-lunar-date-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblunar-date-3-0-1 \
pkgconfig-gio-2.0 \
typelib-1-0-LunarDate-3-0"

inherit rpm
