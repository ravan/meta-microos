SUMMARY = "Csound opcodes for python"
DESCRIPTION = "Csound opcodes for python"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "python3-csound-6.18.1-6.4.aarch64.rpm"
RPM_HASH = "f823f36d787ffe640138731a0d7b9bc528620b7670b9bd967c5409cd946b815553d7e8b7539f32f745d9f3b36388109daaa29e97774b2ba956a1c517d80c00de"

RPROVIDES:${PN} += "python3-csound"

RDEPENDS:${PN} += "python-abi"

inherit rpm
