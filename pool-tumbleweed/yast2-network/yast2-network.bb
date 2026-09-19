SUMMARY = "YaST2 - Network Configuration"
DESCRIPTION = "This package contains the YaST2 component for network configuration."
LICENSE = "GPL-2.0-only"

PV = "5.0.7"

RPM_NAME = "yast2-network-5.0.7-1.2.noarch.rpm"
RPM_HASH = "fc1737a1b6073a905d78113d05315e17981b59b71c032030dcff8bea68308e1dc99cfd59f9f4c5ec3fbb374529be15bac6622b7783f5fdee4bf2d90d760b0430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-network \
yast2-network-devel-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/rm \
augeas-lenses \
hostname \
hwinfo \
rubygem-ruby-4.0.0-cfa \
sysconfig \
yast2 \
yast2-packager \
yast2-proxy \
yast2-ruby-bindings \
yast2-storage-ng \
yast2-xml"

inherit rpm
