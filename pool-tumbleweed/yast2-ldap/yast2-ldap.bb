SUMMARY = "YaST2 - LDAP Agent"
DESCRIPTION = "This agent is used by various YaST2 modules to work with LDAP. It \
enables searching the LDAP tree and adding/deleting/modifying items on \
an LDAP server."
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-ldap-5.0.0-1.13.aarch64.rpm"
RPM_HASH = "e46251007db2ba89ea99631bfd3fb1af2e39bb166eeae1022878b79bd65780ad952ab8111964b546c3523c19dd4c2d5fc1a7aaa5a63564b2ae78c1f7805ed7fb"

RPROVIDES:${PN} += "libpy2ag-ldap.so.2 \
perl-LdapServerAccess \
yast2-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
ldapcpplib \
libc.so.6 \
libgcc-s.so.1 \
liblber.so.2 \
libldapcpp.so.0 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2 \
yast2-network"

inherit rpm
