SUMMARY = "Development files for ldacBT"
DESCRIPTION = "The ldacBT-devel package contains libraries and header files for \
developing applications that use ldacBT."
LICENSE = "Apache-2.0"

PV = "2.0.2.5"

RPM_NAME = "ldacBT-devel-2.0.2.5-1.3.aarch64.rpm"
RPM_HASH = "cc79cc65f90091eaa022b8c30e68e569f55913502820d963e4cdff1bcd680e7981111b2f6642c636968fff2321aeb496c7a58a0514c80166c4b5c459ad7c7b20"

RPROVIDES:${PN} += "ldacBT-devel \
pkgconfig-ldacBT-abr \
pkgconfig-ldacBT-enc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldac2"

inherit rpm
