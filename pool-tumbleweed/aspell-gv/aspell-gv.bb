SUMMARY = "Manx Gaelic (Gaelg) Dictionary for Aspell"
DESCRIPTION = "A Manx Gaelic (Gaelg) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-gv-0.50-4.7.aarch64.rpm"
RPM_HASH = "fa30abaab5084b70655df33b1dbab8806ea826d93ae8b6f7bde705d613cc65e6740cb18eecf9c23a57fdeb5e21196f796a5a6feb9e3184812c3a6b19aa447f9c"

RPROVIDES:${PN} += "aspell-gv \
locale-aspell-gv"

RDEPENDS:${PN} += ""

inherit rpm
