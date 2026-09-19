SUMMARY = "Machines plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on from machines file."
LICENSE = "GPL-2.0-or-later"

PV = "2.36"

RPM_NAME = "pdsh-machines-2.36-1.2.aarch64.rpm"
RPM_HASH = "4416681d9ca98606e1009f4162d1a593ab3fdf1a6153647ffb9585ad7374ed3796cf1c6c7d365a171419aec8a7cf7276b188d741348537bd1aebffaa013d0331"

RPROVIDES:${PN} += "pdsh-machines"

RDEPENDS:${PN} += "libc.so.6 \
pdsh"

inherit rpm
