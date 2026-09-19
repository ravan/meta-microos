SUMMARY = "Documentation for the libvisio API"
DESCRIPTION = "This package contains documentation for the libvisio API."
LICENSE = "MPL-2.0"

PV = "0.1.11"

RPM_NAME = "libvisio-devel-doc-0.1.11-1.3.noarch.rpm"
RPM_HASH = "38d436425bdf7ade98b15b3e128bb7339ff20d562f9077a7871097585e226cf60f407c4334bbcf22ed8853f99a57f0376410a9677578a8f1fffa53de56b35dc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvisio-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
