SUMMARY = "Check SMTP connections"
DESCRIPTION = "This plugin will attempt to open an SMTP connection with the given host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-smtp-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "a384d78a07bad3d25b57918b46b632b7b333b51c17ddfd13fb581269b9771fac982225c4b7249ba42c9dd3669ac6a404a6db327fe927290da7979b3931d907f7"

RPROVIDES:${PN} += "monitoring-plugins-smtp \
nagios-plugins-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
