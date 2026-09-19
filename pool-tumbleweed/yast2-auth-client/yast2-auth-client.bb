SUMMARY = "YaST2 - Centralised System Authentication Configuration"
DESCRIPTION = "With this YaST2 module you may configure centralised system authentication, on a single or multipe network domains."
LICENSE = "GPL-2.0-only"

PV = "5.0.4"

RPM_NAME = "yast2-auth-client-5.0.4-1.2.noarch.rpm"
RPM_HASH = "6666c96693a5dd0ce35a70c0f61ca5d31e21c664e32fba448561988952f269f01141dfc3f154a729dcfcc8d5f2ae7cfe908cb3bf9f620ae928323c6cd210c159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-auth-client"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
net-tools \
yast2 \
yast2-pam \
yast2-ruby-bindings"

inherit rpm
