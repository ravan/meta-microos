SUMMARY = "Test Matrix Generator Library: headers and sources for development"
DESCRIPTION = "This package provides the headers and sources needed to develop against tmglib, \
the Test Matrix Generator Library."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "tmglib-devel-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "0b7c1a740e5d1a8ea95a6f79ea80ce97f7421b1ec15830b0a974d71843178f995440159f79ee18f3574ebfd90ea2a726613ec117aa24b858ecb52fa67498ee4a"

RPROVIDES:${PN} += "tmglib-devel"

RDEPENDS:${PN} += "libtmglib3"

inherit rpm
