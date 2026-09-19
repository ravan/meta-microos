SUMMARY = "X11 Front-End for BibTeX Databases"
DESCRIPTION = "Using bibview, entries in several BiB databases can be moved, \
manipulated, created, and searched."
LICENSE = "SUSE-Permissive"

PV = "2.2"

RPM_NAME = "bibview-2.2-1014.4.aarch64.rpm"
RPM_HASH = "05132a9c1c8c08461d74a8eedf2c4fbe4434e4a6e53448d5de8a1fe12a38ba8da54038ff28600f5c400b1b678fbb9d09c93aec9071b0f96b00eb40ca6320270f"

RPROVIDES:${PN} += "bibview \
bibvw15 \
config-bibview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXt.so.6 \
libc.so.6"

inherit rpm
