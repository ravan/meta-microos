SUMMARY = "Rmail of the BSD Sendmail"
DESCRIPTION = "Rmail interprets incoming mail received via uucp and passing the \
processed mail on to the MTA (e.g. sendmail)."
LICENSE = "Sendmail"

PV = "8.18.2"

RPM_NAME = "rmail-8.18.2-3.3.aarch64.rpm"
RPM_HASH = "0476165db34cbb02f9bbb82bdb97efc7268b2e5f8f32c2e22ef76be9b734086469a9cfbc8f9464c5bf7217c80920aee2e302be880073028d90c0587f1a634bad"

RPROVIDES:${PN} += "rmail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
