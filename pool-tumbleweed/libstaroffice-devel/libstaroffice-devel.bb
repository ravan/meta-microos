SUMMARY = "A library for import of StarOffice documents"
DESCRIPTION = "libstaroffice is a library for import of StarOffice documents."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-devel-0.0.7-3.20.aarch64.rpm"
RPM_HASH = "203f340b8d87ef2d0c53c4934fb7cf2d4c4dd241a059733ef516ca01fac73fc69dcca2501aaf7d1ff06acd5c8214d379e0306f336a0f9ca6105f1a1ed202cdf2"

RPROVIDES:${PN} += "libstaroffice-devel \
pkgconfig-libstaroffice-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstaroffice-0-0-0 \
libstdc++-devel \
pkgconfig-librevenge-0.0"

inherit rpm
