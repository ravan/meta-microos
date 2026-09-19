SUMMARY = "Czech (čeština) Dictionary for Aspell"
DESCRIPTION = "A Czech (český) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.60.0.20040614"

RPM_NAME = "aspell-cs-0.60.0.20040614-4.7.aarch64.rpm"
RPM_HASH = "779b43e19c8a2d020d11c91ac14f1fa5c545b4d14fade2f428c2cafad3de068eb1d3d288083a1c66ff9dd928e4fe924abd1a52783d3c7f5cc013078d01e2de1d"

RPROVIDES:${PN} += "aspell-cs \
locale-aspell-cs"

RDEPENDS:${PN} += ""

inherit rpm
