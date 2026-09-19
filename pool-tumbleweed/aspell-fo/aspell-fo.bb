SUMMARY = "Faroese (føroyskt) Dictionary for Aspell"
DESCRIPTION = "A Faroese (føroyskt) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.16"

RPM_NAME = "aspell-fo-0.2.16-4.7.aarch64.rpm"
RPM_HASH = "42f3f4c00558b64d17733fc9c6ca35e2c86a0c40e4768eee17dcde2793ada77d2d042434c5f9b11c346c6e40cef19483ba900734d5e8421022a9196e68d0405a"

RPROVIDES:${PN} += "aspell-fo \
locale-aspell-fo"

RDEPENDS:${PN} += ""

inherit rpm
