SUMMARY = "The system GNU Objective C Compiler"
DESCRIPTION = "The system GNU Objective C Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-objc-16-1.1.aarch64.rpm"
RPM_HASH = "1204499d8a4809d37bfcb1afdd2cf233a318ff014a8d72072be73a86502a35cc3335c44f71189cc38405ab57e7ec6a3db87c2ff2ef62f381ad2a8512d8aec271"

RPROVIDES:${PN} += "gcc-objc"

RDEPENDS:${PN} += "gcc \
gcc16-objc"

inherit rpm
