SUMMARY = "The openSUSE Installation Control file"
DESCRIPTION = "This package contains the control file used for openSUSE installation."
LICENSE = "MIT"

PV = "20260519"

RPM_NAME = "skelcd-control-openSUSE-20260519-1.2.aarch64.rpm"
RPM_HASH = "d3cc83177cb135d5d20853d6be2b077de1debd4715b86ae02809dc580030efec45b421c267259933109b1861c3a18bf63a8389ed037a2bc0f21627ec578d85db"

RPROVIDES:${PN} += "product-control \
skelcd-control-openSUSE"

RDEPENDS:${PN} += "autoyast2 \
kdump \
release-notes \
rubygem-ruby-4.0.0-byebug \
yast2-add-on \
yast2-configuration-management \
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
yast2-services-manager \
yast2-slp \
yast2-theme \
yast2-trans-stats \
yast2-tune \
yast2-update \
yast2-users \
yast2-x11"

inherit rpm
