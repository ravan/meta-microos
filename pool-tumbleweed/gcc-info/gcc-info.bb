SUMMARY = "The system GNU Compiler documentation"
DESCRIPTION = "The system GNU Compiler documentation."
LICENSE = "GFDL-1.2-only"

PV = "16"

RPM_NAME = "gcc-info-16-1.1.aarch64.rpm"
RPM_HASH = "57e2c9038c219a872d9388537f2060ef2824806a32257fe15a9985ab25ef2944a5428673e2e38d88d306393906f04d29a38fff90e7de9c15b46b15f15a2c36dd"

RPROVIDES:${PN} += "gcc-info"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc16-info"

inherit rpm
