SUMMARY = "Latvian (latviešu) Dictionary for Aspell"
DESCRIPTION = "A Latvian (latviešu) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "aspell-lv-1.2.1-4.7.aarch64.rpm"
RPM_HASH = "5bd95b59065a04c64ae852abdeee6db7f91d140d9c4fb7f766f6b91989d35a146e69ca1294fd13b0d084f26fce3262053f2b9cb1615f96708921a3e9c84f3a7d"

RPROVIDES:${PN} += "aspell-lv \
locale-aspell-lv"

RDEPENDS:${PN} += ""

inherit rpm
