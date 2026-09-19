SUMMARY = "Finnish (suomi) Dictionary for Aspell"
DESCRIPTION = "A Finnish (suomi) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "aspell-fi-0.7-4.7.aarch64.rpm"
RPM_HASH = "ee8d3cbfbc3c2c56ea1ffb0b221845ecc0cc373e5989a48ee94ac0e1bacb6849d7442fb4e19c9bf79d8060f669f8d4f1bb2569d95b8097c3a5b6e1c08dba8cf7"

RPROVIDES:${PN} += "aspell-fi \
locale-aspell-fi"

RDEPENDS:${PN} += ""

inherit rpm
