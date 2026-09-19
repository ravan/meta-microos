SUMMARY = "Telugu (తెలుగు) Dictionary for Aspell"
DESCRIPTION = "A Telugu (తెలుగు) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.2"

RPM_NAME = "aspell-te-0.01.2-4.7.aarch64.rpm"
RPM_HASH = "0ebb056d8254c0f770b9c01c32a1388e2a81143c02b962bb051b67b6ed9d79c17318528119417006c7c70dad3923f10b44388eeb39df98f032c02bbbda8f8500"

RPROVIDES:${PN} += "aspell-te \
locale-aspell-te"

RDEPENDS:${PN} += ""

inherit rpm
