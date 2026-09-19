SUMMARY = "Base System (alias pattern for base)"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-basesystem-20241218-34.1.aarch64.rpm"
RPM_HASH = "ebf0cb0b617c7a0c1debc01498b5a983578913698a80dcacf5963cbf992e5372216ec00643f837223dd32f951f9ab710110910143de6f28430534b7da5438645"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
patterns-base-basesystem"

RDEPENDS:${PN} += "pattern-"

inherit rpm
