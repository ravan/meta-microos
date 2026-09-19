SUMMARY = "The openSUSE Slowroll Installation Control file"
DESCRIPTION = "This package contains the control file used for openSUSE Slowroll installation."
LICENSE = "MIT"

PV = "20250620"

RPM_NAME = "skelcd-control-openSUSE-Slowroll-20250620-1.4.aarch64.rpm"
RPM_HASH = "fa964f79db1bfa7d1c2d152e0abe8a879c489fb9ef81cee21e4e1a47769d1c0fe5d8ee5916d462c661609ba840af18c32c401f296c262ed5124bc180346cce75"

RPROVIDES:${PN} += "product-control \
skelcd-control-openSUSE-Slowroll"

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
