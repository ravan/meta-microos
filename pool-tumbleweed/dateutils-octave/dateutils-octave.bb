SUMMARY = "Dateutils functions for matlab and octave"
DESCRIPTION = "Dateutils can be used from within matlab or ocatave."
LICENSE = "BSD-3-Clause"

PV = "0.4.11"

RPM_NAME = "dateutils-octave-0.4.11-1.8.aarch64.rpm"
RPM_HASH = "35a23b6eb56f362f37f88218948ac6b7f9180cada4af0d5dbc2d86670e0b9a50ce6e05d4b219278761908754eb43a1a5d8fc014397c0ca74c7a9110fb5313410"

RPROVIDES:${PN} += "dateutils-octave"

RDEPENDS:${PN} += "dateutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
octave"

inherit rpm
