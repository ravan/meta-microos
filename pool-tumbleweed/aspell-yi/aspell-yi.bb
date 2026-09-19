SUMMARY = "Yiddish (ייִדיש) Dictionary for Aspell"
DESCRIPTION = "A Yiddish (ייִדיש) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-yi-0.01.1-4.7.aarch64.rpm"
RPM_HASH = "12d2384c6502522cccb0f38c03c6e0ee9e6da16cecad95e477f5352af90c672c2cef46a7cdbbd0e6b295a7baa48773bd9385abbebc6c25b658f797b68ac48d6d"

RPROVIDES:${PN} += "aspell-yi \
locale-aspell-yi"

RDEPENDS:${PN} += ""

inherit rpm
