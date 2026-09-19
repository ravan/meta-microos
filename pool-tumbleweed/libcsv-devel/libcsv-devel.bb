SUMMARY = "Development files for libcsv"
DESCRIPTION = "This package includes development files for libcsv."
LICENSE = "LGPL-2.1+"

PV = "3.0.3"

RPM_NAME = "libcsv-devel-3.0.3-2.35.aarch64.rpm"
RPM_HASH = "e534b6bacbdc1d7490de4e97c9d06c9fc3fa4579a59ca87e52aad206eaabf22d823034a86f6a2c3d25d7784d429621d025af6879a86ed4f1fcd4ffb901568799"

RPROVIDES:${PN} += "libcsv-devel"

RDEPENDS:${PN} += "libcsv3"

inherit rpm
