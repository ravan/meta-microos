SUMMARY = "Examples for javacc"
DESCRIPTION = "Examples for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.13"

RPM_NAME = "javacc-demo-7.0.13-2.11.noarch.rpm"
RPM_HASH = "069fec0ae97210fb287e431db5f706844cce2de131bc6f6da81e794a01ef72ee2cbdfb0d9d467f085598fa3e970def07679bf03d6005658f7577c281a60ee940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-demo"

RDEPENDS:${PN} += "javacc"

inherit rpm
