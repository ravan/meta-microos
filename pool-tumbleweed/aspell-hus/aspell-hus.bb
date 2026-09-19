SUMMARY = "Huastec (wastek) dictionary for Aspell"
DESCRIPTION = "A Huastec (wastek) dictionary for Aspell."
LICENSE = "GPL-3.0-only"

PV = "0.03.1"

RPM_NAME = "aspell-hus-0.03.1-4.7.aarch64.rpm"
RPM_HASH = "037bea1f1c36286ec13d047e49083a56aa5564b0132f177b9756e889626a5ae76c7ec862814c95a064bb9b50739f8528b3e959a91dba6494c75609cba095b50e"

RPROVIDES:${PN} += "aspell-hus \
locale-aspell-hus"

RDEPENDS:${PN} += ""

inherit rpm
