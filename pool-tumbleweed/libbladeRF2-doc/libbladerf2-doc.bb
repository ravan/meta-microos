SUMMARY = "Documentation for libbladeRF"
DESCRIPTION = "HTML documentation files for libbladeRF."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "libbladeRF2-doc-2.6.0-22.3.aarch64.rpm"
RPM_HASH = "de331842ae7fc63db98ccdbc5fdc5f662339e831351571244b21346c348921380659f19a384fbc8d0c6d7edc332f4a51c4449c3a9d7b2fc7d985334efc7a6d73"

RPROVIDES:${PN} += "libbladeRF2-doc"

RDEPENDS:${PN} += ""

inherit rpm
