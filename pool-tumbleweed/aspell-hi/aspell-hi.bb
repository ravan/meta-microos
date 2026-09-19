SUMMARY = "Hindi (हिंदी) Dictionary for Aspell"
DESCRIPTION = "A Hindi (हिंदी) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-hi-0.02-4.7.aarch64.rpm"
RPM_HASH = "679ae4ae53e7ea9d318bd616de8ce51a4e3c58ef6d1269b09e039909fd35172e9d2926a0aa55e7f91299913c6373979018e95ac609d4620e3e6105e25fa1da5e"

RPROVIDES:${PN} += "aspell-hi \
locale-aspell-hi"

RDEPENDS:${PN} += ""

inherit rpm
