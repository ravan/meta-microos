SUMMARY = "Enhanced Base System"
DESCRIPTION = "This is the enhanced base runtime system with lots of convenience packages."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-enhanced_base-20241218-34.1.aarch64.rpm"
RPM_HASH = "589bde947687c7adf60a45bcaf9bc40f8117ea9fe1eba12e745f2fb194f5c4b9f2b6a8dd75ace9d74592478f98259f3d0d9ef9ba6cead34111942d8d717dfba7"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-enhanced-base \
patterns-openSUSE-enhanced-base"

RDEPENDS:${PN} += "openssh \
pattern-"

inherit rpm
