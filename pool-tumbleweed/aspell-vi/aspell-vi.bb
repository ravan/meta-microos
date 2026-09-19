SUMMARY = "Vietnamese (Tiếng Việt) Dictionary for Aspell"
DESCRIPTION = "A Vietnamese (Tiếng Việt) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-vi-0.01.1-4.7.aarch64.rpm"
RPM_HASH = "393d66afbb8defbfd8e45110b56ad34be60e225fb9d87a493914a572960d3a7ea16f8b27900a8fb3426b64e041ad593f19dd5c1aac939d59d86d77faf04fd84e"

RPROVIDES:${PN} += "aspell-vi \
locale-aspell-vi"

RDEPENDS:${PN} += ""

inherit rpm
