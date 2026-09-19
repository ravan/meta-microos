SUMMARY = "Afrikaans Dictionary for Aspell"
DESCRIPTION = "An Afrikaans dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50.0"

RPM_NAME = "aspell-af-0.50.0-4.7.aarch64.rpm"
RPM_HASH = "5588c4bbe69b49c19634be4148d3f408ff930220110e8ee379c78abad4e76792606408dc4fcc6e65564c0ed53965a55bc41c0d407d694b04b30f4289f4168e7f"

RPROVIDES:${PN} += "aspell-af \
locale-aspell-af"

RDEPENDS:${PN} += ""

inherit rpm
