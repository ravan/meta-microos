SUMMARY = "Development headers for device tree library"
DESCRIPTION = "This package provides development files for libfdt"
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "libfdt-devel-1.7.2-2.5.aarch64.rpm"
RPM_HASH = "fb6821c42636efdbba163f7650f62a2b34b2ee09ed46ab07e74b7444e425d4738e497b92ecde0331a59686fc62d5ec92c641c3d95b2c231d38e93f4a86797cff"

RPROVIDES:${PN} += "libfdt-devel \
libfdt1-devel"

RDEPENDS:${PN} += "libfdt1"

inherit rpm
