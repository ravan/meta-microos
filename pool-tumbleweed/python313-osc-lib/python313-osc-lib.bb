SUMMARY = "OpenStackClient Library"
DESCRIPTION = "OpenStackClient (aka OSC) is a command-line client for OpenStack.  osc-lib \
is a package of common support modules for writing OSC plugins."
LICENSE = "Apache-2.0"

PV = "4.7.0"

RPM_NAME = "python313-osc-lib-4.7.0-1.1.noarch.rpm"
RPM_HASH = "742ad6775d5d31014e48ce9c56584f1cafff094d16a5cc7ed7d8cd1666a66e444ad964e4962d23d5ce4efa2ba385404947cd7e6d76c904852ab9063d34969569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osc-lib \
python3.13dist-osc-lib \
python313-osc-lib \
python3dist-osc-lib"

RDEPENDS:${PN} += "python-abi \
python313-cliff \
python313-keystoneauth1 \
python313-openstacksdk \
python313-oslo.i18n \
python313-oslo.utils \
python313-pbr \
python313-platformdirs \
python313-requests \
python313-simplejson \
python313-stevedore"

inherit rpm
