SUMMARY = "Tool to create ethercodes.dat from IEEE.org meta data"
DESCRIPTION = "Tool and required files to create the ethercodes.dat file from the OUI \
and company ID data as provided by IEEE.org.  This package is only \
needed if you want to build the arpwatch-ethercodes package."
LICENSE = "BSD-3-Clause"

PV = "3.9"

RPM_NAME = "arpwatch-ethercodes-build-3.9-1.4.aarch64.rpm"
RPM_HASH = "8ccbc98a6913eee4318187e1443da95c4990beee6fd51d1b54e8481bcc4c1580fff6f6d6bd352845fecdd1107e35761e7bc7c46705d6ad3a8a5e0d8ddb5f1b3a"

RPROVIDES:${PN} += "arpwatch-ethercodes-build"

RDEPENDS:${PN} += ""

inherit rpm
