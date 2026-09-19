SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-only"

PV = "1.32.1"

RPM_NAME = "mednafen-doc-1.32.1-1.12.noarch.rpm"
RPM_HASH = "4e05c95dd8487fade565a3ed97998231b18faebfcb067053beda749f55f58214e937c297a343cfea1370384595bd9d2a3024972125e7002f2c35611d2ef13152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mednafen-doc"

RDEPENDS:${PN} += ""

inherit rpm
