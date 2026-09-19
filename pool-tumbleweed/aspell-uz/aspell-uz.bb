SUMMARY = "Uzbek (Ўзбекча) Dictionary for Aspell"
DESCRIPTION = "An Uzbek (Ўзбекча) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "aspell-uz-0.6.0-4.7.aarch64.rpm"
RPM_HASH = "fee0915ad71a6c076c1e83a4c6c0c971a754802f3a4af2b4e12d4fb47e9d6eed45dadd4f1bf9544142da3ccddd4e745bdafa2c5c692062a2cb31daf9cd7cf989"

RPROVIDES:${PN} += "aspell-uz \
locale-aspell-uz"

RDEPENDS:${PN} += ""

inherit rpm
