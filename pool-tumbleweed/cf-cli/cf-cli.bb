SUMMARY = "Cloud Foundry command line client"
DESCRIPTION = "This is the official command line client for Cloud Foundry."
LICENSE = "Apache-2.0"

PV = "8.18.4+git.0.3fcd823a1"

RPM_NAME = "cf-cli-8.18.4+git.0.3fcd823a1-1.1.aarch64.rpm"
RPM_HASH = "6aa31019392cf566665ce7060c4705df8f128214852250408ae716b41ccb2e765e5fb2a68e5e8b6453b90e909914163c2740b31d81d7aee39bb2db251b06bbfd"

RPROVIDES:${PN} += "cf-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
