SUMMARY = "Kinyarwanda (Ikinyarwanda) Dictionary for Aspell"
DESCRIPTION = "A Kinyarwanda (Ikinyarwanda) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-rw-0.50-4.7.aarch64.rpm"
RPM_HASH = "68684ac5721d5094c78cfebf7a0999fe6416a960409929643c97c994ff819ee083634e0ec288938c5aabb85b7dd06946a66301af0c6dcc83864fb37a138ec58f"

RPROVIDES:${PN} += "aspell-rw \
locale-aspell-rw"

RDEPENDS:${PN} += ""

inherit rpm
