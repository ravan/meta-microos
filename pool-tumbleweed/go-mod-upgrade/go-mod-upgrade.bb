SUMMARY = "Update outdated Go dependencies interactively"
DESCRIPTION = "Update outdated Go dependencies interactively"
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "go-mod-upgrade-0.12.0-1.8.aarch64.rpm"
RPM_HASH = "d716c2cba7ac34d86db0b72e36d4e08c6df2ebb271d5e0abaf8349d4501f408840e8dcb0aaca33fef63d279f36f7c285cc9f9ab0c210a3de7c86ac219e7bde41"

RPROVIDES:${PN} += "go-mod-upgrade"

RDEPENDS:${PN} += ""

inherit rpm
