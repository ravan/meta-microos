SUMMARY = "FreeRADIUS Documentation"
DESCRIPTION = "FreeRADIUS documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-doc-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "c49d0ca752a7ace9dd63ec3466eb286c13b63ff25fa0d56e02ad129f454e6c0c78a5cb27601708cb92da518363ceaa16a788c2a5d5a95667a4abf66040870752"

RPROVIDES:${PN} += "freeradius-server-doc"

RDEPENDS:${PN} += ""

inherit rpm
