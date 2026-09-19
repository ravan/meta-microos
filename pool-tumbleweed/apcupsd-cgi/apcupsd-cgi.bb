SUMMARY = "Web interface for apcupsd"
DESCRIPTION = "A CGI interface to the APC UPS monitoring daemon."
LICENSE = "GPL-2.0-only"

PV = "3.14.14"

RPM_NAME = "apcupsd-cgi-3.14.14-17.9.aarch64.rpm"
RPM_HASH = "7005666f9fbb608e80ae8c711b91f7a44bb32ed74b4430ef5e2ac0f4c209d67771e048e6614df4655c922d56440ca1f627b42b22ab5008aceea3c8bf59824273"

RPROVIDES:${PN} += "apcupsd-cgi \
config-apcupsd-cgi"

RDEPENDS:${PN} += "apcupsd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
