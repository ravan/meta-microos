SUMMARY = "Examples for xml-stylebook"
DESCRIPTION = "Examples demonstrating the use of xml-stylebook."
LICENSE = "Apache-1.1"

PV = "1.0~b3_xalan2"

RPM_NAME = "xml-stylebook-demo-1.0~b3_xalan2-1.8.noarch.rpm"
RPM_HASH = "4f5867d5aa02bc04031a065aa5d2c17a0c124e8e432145aad4fb1429dc06238515c06ffd0cd4aa2ce548dae2bbf57a5c57b5c92598b45f2742f23d3fb6714593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-stylebook-demo"

RDEPENDS:${PN} += "xml-stylebook"

inherit rpm
