SUMMARY = "German (deutsch) Dictionary for Aspell"
DESCRIPTION = "A German (deutsch) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20161207.7.0"

RPM_NAME = "aspell-de-20161207.7.0-4.7.aarch64.rpm"
RPM_HASH = "0ef35438cd58fe74cae91768f551ed87adf4cb8f6b45831379dfbf7df9627c19f98ac84c8593c04c77d28e35a72b108c3218762cec0dba99b06c2d7a268bb36e"

RPROVIDES:${PN} += "aspell-de \
locale-aspell-de"

RDEPENDS:${PN} += ""

inherit rpm
