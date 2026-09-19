SUMMARY = "YaST2 - Samba Server Configuration"
DESCRIPTION = "This package contains the YaST2 component for Samba server \
configuration."
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-samba-server-5.0.2-1.2.noarch.rpm"
RPM_HASH = "d774dfa3ef4e1a786450dda67e80118d1129a75acef5525c5fc340232e304f27d04a03f39cb656e8d591fa0ec6fbdc32d8044c6fa7632167b22e7bb5b4f4be5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SambaAccounts \
perl-SambaBackend \
perl-SambaBackendLDAP \
perl-SambaBackendSimple \
perl-SambaPrinters \
perl-SambaRole \
perl-SambaSecrets \
perl-SambaServer \
perl-SambaService \
perl-SambaTrustDom \
perl-UsersPluginSamba \
perl-UsersPluginSambaGroups \
perl-YaPI--Samba \
yast2-samba-server"

RDEPENDS:${PN} += "perl-Crypt-SmbHash \
yast2 \
yast2-ldap \
yast2-network \
yast2-perl-bindings \
yast2-ruby-bindings \
yast2-samba-client \
yast2-users"

inherit rpm
