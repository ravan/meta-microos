SUMMARY = "This package contains the development files needed by libpaper"
DESCRIPTION = "This package contains all devel files needed by the libpaper package"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.8"

RPM_NAME = "libpaper-devel-2.2.8-1.3.aarch64.rpm"
RPM_HASH = "67eb79428e792e529dc9b9fdc1d2e0d5c4bfabeb5b7b87f6b18373c3cabebc84f1a4bd4a21db5940ac19dbc4fd55e60a0f04441736a062be16e87c80a052138a"

RPROVIDES:${PN} += "libpaper-devel"

RDEPENDS:${PN} += "libpaper2"

inherit rpm
