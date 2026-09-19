SUMMARY = "The cyrus-sasl LDAP auxprop plugin"
DESCRIPTION = "The LDAP auxprop plugin allows for tighter application/directory \
integration."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ldap-auxprop-bdb-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "8e3eb917747761476b42347043b3d73fb7294fa7d70f726e5d8a3bed658c4960e7bf4ed3dd836412e5a0a277fa779d438fa07f5ea3761b952dab194882df61ae"

RPROVIDES:${PN} += "cyrus-sasl-ldap-auxprop-bdb \
libldapdb.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2"

inherit rpm
