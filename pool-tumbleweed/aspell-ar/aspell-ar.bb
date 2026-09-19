SUMMARY = "Arabic (العربية) Dictionary for Aspell"
DESCRIPTION = "An Arabic (العربية) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "aspell-ar-1.2.0-4.7.aarch64.rpm"
RPM_HASH = "6e37d1505936ddceb760b88e143b2c028ef820aa8328c62a010a97b10c650e46278846e1fe25ee1609f31b4c0741b275253ccd4f63ad782be1ae1d8e979bd2c8"

RPROVIDES:${PN} += "aspell-ar \
locale-aspell-ar"

RDEPENDS:${PN} += ""

inherit rpm
