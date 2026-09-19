SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kvm_stat-rebuild-7.2.5-25.89.noarch.rpm"
RPM_HASH = "ab9c399f06977f59698ab45391660880d24ca64922aa659cd5158219882ec26dcc89cc310349edc2bc7d95a00a20aa34f81ad123a727e796cf57bb0d323c5532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
