SUMMARY = "Active Directory Compatible Service Interfaces Editor"
DESCRIPTION = "The ADSI Edit for YaST module provides tools for viewing and modifying \
an LDAP tree."
LICENSE = "GPL-3.0-only"

PV = "1.6"

RPM_NAME = "yast2-adsi-1.6-1.28.noarch.rpm"
RPM_HASH = "3e2def6c824141382301f4fd84359b639ffb25460de363d8325d000711b55408c172fb09f3316117f29f5c73e2d9e435c64ff25fc8cfac33ec660179e853e924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-adsi"

RDEPENDS:${PN} += "krb5-client \
python3-ldap \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
