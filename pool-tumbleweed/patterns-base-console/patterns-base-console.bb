SUMMARY = "Console Tools"
DESCRIPTION = "Applications useful for those using the console and no graphical desktop environment."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-console-20241218-34.1.aarch64.rpm"
RPM_HASH = "794eedd6d981e22b4d413dd037118691a33bcb5810ae17872adf1eab77fcaacdd0cec4eb4caee191e980934ee14604a8a69d70cad07c1d55bd7921d33c993e81"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-console \
patterns-openSUSE-console"

RDEPENDS:${PN} += "pattern-"

inherit rpm
