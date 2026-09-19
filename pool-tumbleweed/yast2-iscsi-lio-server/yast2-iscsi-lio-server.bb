SUMMARY = "Configuration of iSCSI LIO target"
DESCRIPTION = "This package contains configuration of iSCSI LIO target"
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-iscsi-lio-server-5.0.0-1.15.noarch.rpm"
RPM_HASH = "3943ce03f75a4bc9de0905b72f238b730af755e3241950020e8b3380a33d1fdc320931d5f56ec31babb7a317cf255857221ca99d775732016e11d0ad937f1012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-iscsi-lio-server"

RDEPENDS:${PN} += "python3-configshell-fb \
python3-rtslib-fb \
python3-targetcli-fb \
yast2 \
yast2-ruby-bindings"

inherit rpm
