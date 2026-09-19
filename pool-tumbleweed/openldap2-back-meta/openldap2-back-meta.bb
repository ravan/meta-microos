SUMMARY = "OpenLDAP Meta backend"
DESCRIPTION = "The OpenLDAP Meta back-end is able to perform basic LDAP proxying with \
respect to a set of remote LDAP servers. The information contained in \
these servers can be presented as belonging to a single Directory \
Information Tree (DIT)."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-back-meta-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "5cb498c07d3db327b78138dd6ccc1337d013528ad5b5011eaa9146169dcae3196d650c7235eac1a91da0de401687278616a9283f0a2e76d8c4f2304edcec6552"

RPROVIDES:${PN} += "openldap2-/usr/share/man/man5/slapd-meta.5.gz \
openldap2-back-meta"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openldap2"

inherit rpm
