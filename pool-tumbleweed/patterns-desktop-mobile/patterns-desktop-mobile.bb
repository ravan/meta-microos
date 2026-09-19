SUMMARY = "Mobile"
DESCRIPTION = "Tools designed specifically for laptop computers."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-mobile-20201106-5.5.aarch64.rpm"
RPM_HASH = "da0f4b86873279b636c5c761067c3b8774e72753ecc24c698f1f6c3a97095357f7e9195e47452ff3f6d099038becd0faf6a66bff9d120daedd3b793e6ae9d164"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-desktop-mobile \
patterns-openSUSE-laptop \
patterns-openSUSE-mobile"

RDEPENDS:${PN} += "pattern-"

inherit rpm
