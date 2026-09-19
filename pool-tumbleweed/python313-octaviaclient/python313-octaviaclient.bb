SUMMARY = "Octavia Plugin for the OpenStack Command-line Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service."
LICENSE = "Apache-2.0"

PV = "3.15.0"

RPM_NAME = "python313-octaviaclient-3.15.0-1.1.noarch.rpm"
RPM_HASH = "4a6cde148becc2d67955d07faf562c08ccddfe138c26ea48ae052ae9ca14b7b98c14cb6f18a2cb471608fb0012337fe699661af684a42fe1bcde6b1476f46445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-octaviaclient \
python3.13dist-python-octaviaclient \
python313-octaviaclient \
python3dist-python-octaviaclient"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-cliff \
python313-keystoneauth1 \
python313-netifaces \
python313-openstackclient \
python313-openstacksdk \
python313-osc-lib \
python313-oslo.serialization \
python313-oslo.utils \
python313-requests"

inherit rpm
