SUMMARY = "Sonivox library - Development files"
DESCRIPTION = "Development files for the sonivox library."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "sonivox-devel-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "a1a0aeb30e34ff8279f0bebdc537d7ecf9883bff0474c3c2b9013f7ebc93b477df46a6c5edd3542d53c1509224a8f73687e7431b1d5a777db5c20a9277cb3096"

RPROVIDES:${PN} += "cmake-sonivox \
pkgconfig-sonivox \
sonivox-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsonivox4"

inherit rpm
