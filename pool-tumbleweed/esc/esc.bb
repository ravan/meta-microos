SUMMARY = "Embeds files into go programs"
DESCRIPTION = "esc embeds files into go programs and provides http.FileSystem interfaces to them."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "esc-0.2.0-3.8.aarch64.rpm"
RPM_HASH = "10a87ad97f4211981060f37149b6c2d6bf346ad16dce80fe62d9b96c237b9afdf49122e2a74ee3f5214e6f1973415e98c398abd4132d84e658986b724bb6b803"

RPROVIDES:${PN} += "esc"

RDEPENDS:${PN} += ""

inherit rpm
