SUMMARY = "LDAP client"
DESCRIPTION = "Packages required to enable LDAP client support via sssd on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-sssd_ldap-5.0-111.1.aarch64.rpm"
RPM_HASH = "b0395580356b36527e4c1d97fee1806ace392c9ba128306263ad4ad3c389bf6e40d4c99b2e11803888cea69223e8c4c14a9caf2672e50da4a2b1a460133cf9d0"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-sssd-ldap"

RDEPENDS:${PN} += "sssd \
sssd-ldap"

inherit rpm
