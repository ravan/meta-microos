SUMMARY = "Manual for Multi-Schema Validator"
DESCRIPTION = "Manual for Multi-Schema Validator."
LICENSE = "BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-manual-2013.6.1-7.2.noarch.rpm"
RPM_HASH = "cc202dbcfb05f6bc926496d837e8fc17c80129674762653c9d50f098954eafb7db73473a3e788c5c111f634bf5007b44a5bf24bdd7cdf745e5cc935bb84c0109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-manual"

RDEPENDS:${PN} += ""

inherit rpm
