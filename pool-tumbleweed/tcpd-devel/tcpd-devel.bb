SUMMARY = "Include Files and Libraries for the TCP wrapper library"
DESCRIPTION = "This package contains the library and header files, which are necessary \
to compile and link programs against the TCP wrapper library."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "tcpd-devel-7.6-901.6.aarch64.rpm"
RPM_HASH = "9f8c97e807ad784af649513f35fe84c040852df083c7b68135080766453efd777f1d689c46e326a21a4433103ef8f04d556214b008144944755d0162795309d6"

RPROVIDES:${PN} += "tcpd-devel"

RDEPENDS:${PN} += "glibc-devel \
libwrap0"

inherit rpm
