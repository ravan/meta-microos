SUMMARY = "Python bindings for Caja - Development Files"
DESCRIPTION = "Development files needed for writing Caja Python extensions. \
 \
This package contains bindings to write Caja extensions with Python. \
It allows writing menu, property pages and column providers \
extensions, so that Caja functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "python-caja-devel-1.28.0-1.9.aarch64.rpm"
RPM_HASH = "c1a68d0b8d713bce3cb5c9b1bdff581297d9781758a55ed339adc7853c6dbdf3692b8a24ac3b366bfbb8db4fe9bb81349d5e2516076cd5b597a56b874a294f85"

RPROVIDES:${PN} += "pkgconfig-caja-python \
python-caja-devel \
python-mate-file-manager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python-caja"

inherit rpm
