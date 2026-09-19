SUMMARY = "Chichewa Dictionary for Aspell"
DESCRIPTION = "A Chichewa dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-ny-0.01-4.7.aarch64.rpm"
RPM_HASH = "f9615b4ff1ca33e31cae81efd521413c0e8bf5b75fab3e12ce9ee37e5c5f065ae17045877414caa2c5c5a35025f8574aabca81a46b99c48982ac95af6b18d0da"

RPROVIDES:${PN} += "aspell-ny \
locale-aspell-ny"

RDEPENDS:${PN} += ""

inherit rpm
