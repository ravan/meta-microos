SUMMARY = "Marathi (मराठी) Dictionary for Aspell"
DESCRIPTION = "A Marathi (मराठी) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "aspell-mr-0.10-4.7.aarch64.rpm"
RPM_HASH = "1ef008406d5d12b6576cc04d3f2860b549cd9605258c66a0dfb8da6f2ce7f59d7790f3a33591661e343673cf271dfffc34226c61794f9f8c76b4d33107fbe42d"

RPROVIDES:${PN} += "aspell-mr \
locale-aspell-mr"

RDEPENDS:${PN} += ""

inherit rpm
