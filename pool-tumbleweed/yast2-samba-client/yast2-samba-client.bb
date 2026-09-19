SUMMARY = "YaST2 - Samba Client Configuration"
DESCRIPTION = "This package contains the YaST2 component for configuration of an SMB \
workgroup/domain and authentication against an SMB domain."
LICENSE = "GPL-2.0-only"

PV = "5.0.5"

RPM_NAME = "yast2-samba-client-5.0.5-1.1.noarch.rpm"
RPM_HASH = "8d7bdc30c5fc6ffa99d383568e37d631f1078d42838fe56a6a6c248aec394f960690111274b7411cdfc83ba5742205d507e01ffa9f5e2ad4134564b2680bf403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SambaAD \
perl-SambaConfig \
perl-SambaNetJoin \
perl-SambaNmbLookup \
perl-SambaWinbind \
yast2-samba-client"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-XML-LibXML \
yast2 \
yast2-network \
yast2-pam \
yast2-python3-bindings \
yast2-ruby-bindings"

inherit rpm
