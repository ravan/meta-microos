SUMMARY = "openSUSE MicroOS using DNF5"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the DNF5 package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-dnf5-5.0-111.1.aarch64.rpm"
RPM_HASH = "9c9e28bf06ecaf15a74e1af5b7984b44396c8695dd0f4a78f62eb24b0215d4028e31d0980433dc1b921cf35f9685b6328a2c0c28156fab98a6e1c166b1be7d90"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-dnf5"

RDEPENDS:${PN} += "dnf5 \
libdnf5-plugin-txnupd \
pattern-"

inherit rpm
