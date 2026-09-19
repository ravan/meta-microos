SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libdebuginfod-dummy-devel-0.194-1.4.aarch64.rpm"
RPM_HASH = "d5647629a0e1840a806782e59f57d14545960b1bace3ab0f42e1840715fefb3f4ee962f386094ce6c859f44fd08075e337d5827ce9bdcf29b4096ed85d9fa545"

RPROVIDES:${PN} += "libdebuginfod-devel \
libdebuginfod-dummy-devel"

RDEPENDS:${PN} += "libdebuginfod1-dummy"

inherit rpm
