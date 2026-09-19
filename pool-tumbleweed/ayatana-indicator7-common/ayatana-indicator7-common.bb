SUMMARY = "Common files used by libayatana-indicator"
DESCRIPTION = "This library contains information to build indicators to go into \
the indicator applet. \
 \
This package contains common files."
LICENSE = "GPL-3.0-only"

PV = "0.9.4"

RPM_NAME = "ayatana-indicator7-common-0.9.4-2.4.noarch.rpm"
RPM_HASH = "b5d29db3cf32354ac6b140820c0e77c88f1e7181373e2d791e5b40e8defe55e61374181f65197a31f6a6cbfe125d005ceff3bf175bb894d8e822272e75889d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ayatana-indicator7-common"

RDEPENDS:${PN} += ""

inherit rpm
