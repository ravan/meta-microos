SUMMARY = "Alternative Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Alternative additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-alt_onlyDVD-5.0-111.1.aarch64.rpm"
RPM_HASH = "111d6429319f2ec39ad7966abc8c5854d83a6dea1d8051178fff08eeeb7a1b4abc3560d343356fdf021ed073fb8c10b05fe3604b65786a177fe19b816d2fa18c"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-alt-onlyDVD"

RDEPENDS:${PN} += "kernel-default-base \
pattern-"

inherit rpm
