SUMMARY = "Development files for the Secure Real-Time Transport Protocol (SRTP) library v2"
DESCRIPTION = "libsrtp is Cisco's implementation of the Secure Real-time Transport \
Protocol (SRTP), the Universal Security Transform (UST), and a \
supporting cryptographic kernel. \
 \
This subpackage contains the development headers."
LICENSE = "BSD-3-Clause"

PV = "2.8.0"

RPM_NAME = "libsrtp2-devel-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "12ec6085ad7ed98b6720a277637431a59badef05f9d1b6a84988650581991f7077bf9ddbe74a957d5ab8000df642d9f3b337426053b59c2eb84324d46f5aebc9"

RPROVIDES:${PN} += "libsrtp2-devel \
pkgconfig-libsrtp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrtp2-1"

inherit rpm
