SUMMARY = "OpenStackClient Library"
DESCRIPTION = "OpenStackClient (aka OSC) is a command-line client for OpenStack.  osc-lib \
is a package of common support modules for writing OSC plugins."
LICENSE = "Apache-2.0"

PV = "4.7.0"

RPM_NAME = "python314-osc-lib-4.7.0-1.1.noarch.rpm"
RPM_HASH = "03de821801345be7b14c5967be2333134f9b3d538ee514c22aadf911c30cdb3b3202e9657de20d96426ea5f6b9682dc6acf47dda7e4400c67c6d55118cd11981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-osc-lib \
python314-osc-lib \
python3dist-osc-lib"

RDEPENDS:${PN} += "python-abi \
python314-cliff \
python314-keystoneauth1 \
python314-openstacksdk \
python314-oslo.i18n \
python314-oslo.utils \
python314-pbr \
python314-platformdirs \
python314-requests \
python314-simplejson \
python314-stevedore"

inherit rpm
