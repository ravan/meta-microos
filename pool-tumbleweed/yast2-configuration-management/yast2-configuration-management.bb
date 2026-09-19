SUMMARY = "YaST2 - YaST Configuration Management"
DESCRIPTION = "This package contains the YaST2 component for Configuration Management Provisioning."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-configuration-management-5.0.1-1.2.noarch.rpm"
RPM_HASH = "cab33e0b4cacabbc55b94efcc19afd2eb7b0a998e96149523d210c1306523ec91bab6e22045060d504811139b7588bedf2ec6f7697c28f68872f98284f205a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-configuration-management"

RDEPENDS:${PN} += "yast2 \
yast2-installation"

inherit rpm
