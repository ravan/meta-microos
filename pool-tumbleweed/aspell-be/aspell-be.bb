SUMMARY = "Belarusian (беларуская мова) Dictionary for Aspell"
DESCRIPTION = "A Belarusian (беларуская мова) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-be-0.01-4.7.aarch64.rpm"
RPM_HASH = "c39e997f5cc0c238ba2b9a7680043af0b5c864b08eb5d26b51f0538cad47bc521b368a22ddfedc1ce0b5fd094f399b6ebbce2e30e68ef27fba0ee889358beab7"

RPROVIDES:${PN} += "aspell-be \
locale-aspell-be"

RDEPENDS:${PN} += ""

inherit rpm
