SUMMARY = "Software Management"
DESCRIPTION = "This pattern provides a graphical application and a command line tool for keeping your system up to date."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-sw_management-20241218-34.1.aarch64.rpm"
RPM_HASH = "be399e08cae00023d0ec0f9594168be84e6de6a7920e82483bbecc39d5ce3ab6cf2ecd9418f6c4256f706a02934b2163e638a1b41bc9145ac552291e67f772fc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-sw-management \
patterns-openSUSE-sw-management"

RDEPENDS:${PN} += "zypper"

inherit rpm
