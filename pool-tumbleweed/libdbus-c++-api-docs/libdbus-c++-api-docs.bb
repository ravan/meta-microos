SUMMARY = "C++ Interface for DBus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-api-docs-0.9.1+git20170322-5.8.noarch.rpm"
RPM_HASH = "1ec0054ebb54b1ecc5eec95a56df17d9cac6424d0878a0a4712652b601fd164e92e3461555e8b486d6530ae33c8a31c1dac78d86b914b76ab3e31538a917e9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbus-c++-api-docs"

RDEPENDS:${PN} += ""

inherit rpm
