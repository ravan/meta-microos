SUMMARY = "Oriya (ଓଡ଼ିଆ) Dictionary for Aspell"
DESCRIPTION = "An Oriya (ଓଡ଼ିଆ) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.03"

RPM_NAME = "aspell-or-0.03-4.7.aarch64.rpm"
RPM_HASH = "9300bc6bf406e9b9d1385149aef28cd568a516c5401ddea6703d09dc208d99cf4588e2e7fb36b0f7a04b0c0f103ba8e153efd098e108d6dba0ff6f4862c115f7"

RPROVIDES:${PN} += "aspell-or \
locale-aspell-or"

RDEPENDS:${PN} += ""

inherit rpm
