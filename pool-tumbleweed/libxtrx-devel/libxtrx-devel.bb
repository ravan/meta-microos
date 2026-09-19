SUMMARY = "Development files for libxtrx"
DESCRIPTION = "High level XTRX API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrx."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrx-devel-0.0.0+git.20201202-6.3.aarch64.rpm"
RPM_HASH = "f5036957588fc07146e00eeddb3f6c67e1e3870aa59172f1e22da571c45b7612b19691377606fff47c7fd5a47ebbd7990b39367cd1de83efa2106cda94ebadd0"

RPROVIDES:${PN} += "libxtrx-devel \
pkgconfig-libxtrx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrx0"

inherit rpm
