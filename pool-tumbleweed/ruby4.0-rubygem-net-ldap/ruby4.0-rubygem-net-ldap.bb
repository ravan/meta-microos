SUMMARY = "Net::LDAP for Ruby (also called net-ldap) implements client access"
DESCRIPTION = "Net::LDAP for Ruby (also called net-ldap) implements client access for the \
Lightweight Directory Access Protocol (LDAP), an IETF standard protocol for \
accessing distributed directory services. Net::LDAP is written completely in \
Ruby with no external dependencies. It supports most LDAP client features and \
a \
subset of server features as well. \
Net::LDAP has been tested against modern popular LDAP servers including \
OpenLDAP and Active Directory. The current release is mostly compliant with \
earlier versions of the IETF LDAP RFCs (2251-2256, 2829-2830, 3377, and 3771). \
Our roadmap for Net::LDAP 1.0 is to gain full <em>client</em> compliance with \
the most recent LDAP RFCs (4510-4519, plutions of 4520-4532)."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "ruby4.0-rubygem-net-ldap-0.19.0-1.11.aarch64.rpm"
RPM_HASH = "0e376bf6d73f01989d292e3d89c4d1bc3c40048c5d0f6528747668ed6eb898882075544310ff37313db4164aa6dcab127bdcfcca3ad96d6090ab2ed9a668225f"

RPROVIDES:${PN} += "ruby4.0-rubygem-net-ldap \
rubygem-net-ldap \
rubygem-ruby-4.0.0-net-ldap \
rubygem-ruby-4.0.0-net-ldap-0 \
rubygem-ruby-4.0.0-net-ldap-0.19 \
rubygem-ruby-4.0.0-net-ldap-0.19.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
