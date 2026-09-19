SUMMARY = "Maliit Framework documentation"
DESCRIPTION = "Provides doxygen documentation for the Maliit Framework."
LICENSE = "LGPL-2.1-only"

PV = "2.3.0"

RPM_NAME = "maliit-framework-doc-2.3.0-1.18.aarch64.rpm"
RPM_HASH = "434d380f615e431cf7424f237bfcd890436d487de19076610f99a0473f1ae9426fc03183859e931aa1121e2769f577f13e96eec8a10ef4b1a2e33f5f05240083"

RPROVIDES:${PN} += "maliit-framework-doc"

RDEPENDS:${PN} += ""

inherit rpm
