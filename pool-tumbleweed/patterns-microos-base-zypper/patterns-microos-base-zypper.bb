SUMMARY = "openSUSE MicroOS using Zypper"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Zypper package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-zypper-5.0-111.1.aarch64.rpm"
RPM_HASH = "7091f30373f74bae58d853e5f5b19ad263fb76ae664b48bbf7bef1c3ddc5612a352a9d63d2d8c25f43fb08cf359ed94f2c545afa00e1dbb90f0dcc4be2ecfbce"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-zypper"

RDEPENDS:${PN} += "pattern- \
transactional-update \
transactional-update-zypp-config \
zypp-boot-plugin \
zypp-excludedocs \
zypp-no-multiversion \
zypp-no-recommends \
zypper \
zypper-needs-restarting"

inherit rpm
