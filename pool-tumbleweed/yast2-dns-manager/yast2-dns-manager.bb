SUMMARY = "Samba Internal DNS Manager"
DESCRIPTION = "DNS Manager for the Internal Samba Active Directory Domain Controller DNS server."
LICENSE = "GPL-3.0-only"

PV = "0.1"

RPM_NAME = "yast2-dns-manager-0.1-1.28.noarch.rpm"
RPM_HASH = "b61b65cd6bdb2944f131431c0afb79c90adc2f2b3f70076c586346f5515d18357020a3972de8658bb1f2c3aad8c90722c5841f7eecabc18c5838f7c80b0d02b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-dns-manager"

RDEPENDS:${PN} += "krb5-client \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
