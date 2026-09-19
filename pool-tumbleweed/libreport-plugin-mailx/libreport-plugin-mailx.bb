SUMMARY = "libreport's mailx reporter plugin"
DESCRIPTION = "The simple reporter plugin which sends a report via mailx to a specified \
email address."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-mailx-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "710dcd565294245d59a44925b815d90ddc8f8d88af27d8b01b7f8fa9ff720982861db314216013b86d47ac2795a9708d1b07f2c4bce4e6a2fbb09fac20c36325"

RPROVIDES:${PN} += "config-libreport-plugin-mailx \
libreport-plugin-mailx"

RDEPENDS:${PN} += "/usr/bin/mailx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport.so.2"

inherit rpm
