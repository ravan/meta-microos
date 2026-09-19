SUMMARY = "Mutt Carddav search program"
DESCRIPTION = "mcds is a command line tool primarily used as a search query plugin \
for mutt to query a carddav server."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "mcds-1.10-1.1.aarch64.rpm"
RPM_HASH = "36ce882b4725ea1d2cec2d5d90963d814be4addb677de62db4a4d3a15376a88234e48e130ab4480939cedbfe65fe00ff490d6c15a9c8b52a9e1a213ab30f6256"

RPROVIDES:${PN} += "mcds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libglib-2.0.so.0 \
libgpgme.so.45 \
libsecret-1.so.0 \
libxml2.so.16"

inherit rpm
