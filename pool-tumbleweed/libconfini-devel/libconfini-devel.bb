SUMMARY = "INI file parser library - development files"
DESCRIPTION = "libconfini is a INI file parser library written in C. \
This package contains files required for development."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.4"

RPM_NAME = "libconfini-devel-1.16.4-1.15.aarch64.rpm"
RPM_HASH = "9244a515d42509fecdbf5da16f584729e3f7fca9e0c4bf2e0d2de548aaf617e778e3da19b6a19fb828707fa40b9b0cfe7d0ff2f4614c075eecc5b01347529421"

RPROVIDES:${PN} += "libconfini-devel \
pkgconfig-libconfini"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfini0"

inherit rpm
