SUMMARY = "Azerbaijani (تورکجه) Dictionary for Aspell"
DESCRIPTION = "An Azerbaijani (تورکجه) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-az-0.02-4.7.aarch64.rpm"
RPM_HASH = "85d24267d88c21bd7611ceaf3c9d07906e5355a5b0b9bcc3b6a3efff8c4f4b893b699db69bdd3fdd38c1c254d90c54e7be847c5260534f322ca7a2cd6bf5cd8a"

RPROVIDES:${PN} += "aspell-az \
locale-aspell-az"

RDEPENDS:${PN} += ""

inherit rpm
