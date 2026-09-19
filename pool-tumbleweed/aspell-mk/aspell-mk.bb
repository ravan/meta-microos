SUMMARY = "Macedonian (македонски) Dictionary for Aspell"
DESCRIPTION = "A Macedonian (македонски) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-mk-0.50-4.7.aarch64.rpm"
RPM_HASH = "71e55cf6cef57a6ea0c3489ff34b3f03f588005ec5da2f38cd51bb7ae322de4b1d88ab23b760e53d852b046c8e772c14497bf36b6196e95669e72823c3dde120"

RPROVIDES:${PN} += "aspell-mk \
locale-aspell-mk"

RDEPENDS:${PN} += ""

inherit rpm
