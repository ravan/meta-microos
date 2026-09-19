SUMMARY = "Headers for djvulibre libraries"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.30"

RPM_NAME = "libdjvulibre-devel-3.5.30-1.3.aarch64.rpm"
RPM_HASH = "a2dcadaf004cf4bc177f00dbe6eeeb0044548ee84f1576a9f22157bda20c46c7c8059a40bf65622bc44dcbacf8b262b825bf75ff5608a55970624a5bdbbbef30"

RPROVIDES:${PN} += "libdjvulibre-devel \
pkgconfig-ddjvuapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdjvulibre21"

inherit rpm
