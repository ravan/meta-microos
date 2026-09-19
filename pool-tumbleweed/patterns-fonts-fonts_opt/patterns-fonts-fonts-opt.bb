SUMMARY = "Fonts (Extra)"
DESCRIPTION = "Extra fonts and font configuration."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-fonts-fonts_opt-20170319-13.2.aarch64.rpm"
RPM_HASH = "0bc223228b88c9d110bb1ed7a58f32a9736c7467db1adad113e60017defdd9938d9da93514acf2150d169e78e4d8b2c30c5ebd599a2786faa487f853c582f55c"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-fonts-fonts-opt"

RDEPENDS:${PN} += ""

inherit rpm
