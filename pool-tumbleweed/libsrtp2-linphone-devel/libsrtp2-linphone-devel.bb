SUMMARY = "Development files for the Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
This subpackage contains the development headers."
LICENSE = "BSD-3-Clause"

PV = "2.4.2~git.20240220"

RPM_NAME = "libsrtp2-linphone-devel-2.4.2~git.20240220-1.6.aarch64.rpm"
RPM_HASH = "df59d7029a185dd8db7fba5c2671637c21478dd66b484e22c0276420fdf3ce8bcf7844cdc48a732239d642a7d39a3772a6bff184e629785585232f92453c16a4"

RPROVIDES:${PN} += "libsrtp2-linphone-devel \
pkgconfig-libsrtp2-linphone"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrtp2-linphone1"

inherit rpm
