SUMMARY = "Quechua (Runasimi (qheshwa)) Dictionary for Aspell"
DESCRIPTION = "A Quechua (Runasimi (qheshwa)) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-qu-0.02-4.7.aarch64.rpm"
RPM_HASH = "21d1fa9547b600113449d298fad2c9d7c9fe421699e64ef7a2814077a1bd6ca33ee4b323cce15a3db51749c52b9903baff455a879c984c6a135b553215eef596"

RPROVIDES:${PN} += "aspell-qu \
locale-aspell-qu"

RDEPENDS:${PN} += ""

inherit rpm
