SUMMARY = "Documentation for qt6-quickeffectmaker in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quickeffectmaker-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "39b379a7b2bad83b789e2ddb1088edd44840dcbe73b21e9bcef945fdec88ecfa678230825935c1f1213a85d07fb7b4346a73c7a59c7453742e49562d8120f430"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
