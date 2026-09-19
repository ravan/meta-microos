SUMMARY = "The MicroOS control file needed for installation"
DESCRIPTION = "The package contains the MicroOS control file needed for installation."
LICENSE = "MIT"

PV = "20260814"

RPM_NAME = "skelcd-control-MicroOS-20260814-1.1.aarch64.rpm"
RPM_HASH = "39571292a987446fd408b0c6824ca6c4b7431723037bbd97f0b1e3d938234aca47c32e937e8434ebdf90a262a6fd72b8f28cd7822c3a77a43b24845e58f3b156"

RPROVIDES:${PN} += "product-control \
skelcd-control-MicroOS"

RDEPENDS:${PN} += "autoyast2 \
kdump \
rubygem-ruby-4.0.0-byebug \
yast2-add-on \
yast2-buildtools \
yast2-devtools \
yast2-fcoe-client \
yast2-firewall \
yast2-installation \
yast2-iscsi-client \
yast2-kdump \
yast2-multipath \
yast2-network \
yast2-nfs-client \
yast2-ntp-client \
yast2-proxy \
yast2-qt-branding-openSUSE \
yast2-rdp \
yast2-services-manager \
yast2-slp \
yast2-theme \
yast2-trans-stats \
yast2-tune \
yast2-update \
yast2-users \
yast2-x11"

inherit rpm
