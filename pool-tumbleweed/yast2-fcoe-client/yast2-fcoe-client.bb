SUMMARY = "YaST2 - Configuration of Fibre Channel over Ethernet"
DESCRIPTION = "This package contains the YaST2 component for the Fibre Channel over \
Ethernet (FCoE) configuration."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-fcoe-client-5.0.1-1.2.noarch.rpm"
RPM_HASH = "ab85e74835544b3f0780378e7e104582fd94cc6840038b627775c004d8541d92dd42f3235c59dc2f33ab02c4a64aef0fdf6bddda9467190bcc3ceba4c07948fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-fcoe-client"

RDEPENDS:${PN} += "fcoe-utils \
yast2 \
yast2-network \
yast2-ruby-bindings"

inherit rpm
