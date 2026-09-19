SUMMARY = "OpenLDAP Client Libraries"
DESCRIPTION = "This package contains the OpenLDAP client libraries."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "libldap2-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "95c0cf63938304ea82f775f7ac53bea1095cb655c4813ccf9bb082d5247638007ea3371d51266eb68f4d4531e5e8fb1fc58054d14d4abe20036035972d3b2ed7"

RPROVIDES:${PN} += "liblber.so.2 \
libldap.so.2 \
libldap2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsasl2.so.3 \
libssl.so.3"

inherit rpm
