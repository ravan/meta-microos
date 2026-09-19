SUMMARY = "Python API and CLI for OpenStack Nova"
DESCRIPTION = "This is a client for the OpenStack Nova API. There's a Python API (the \
novaclient module), and a command-line script (nova). Each implements 100% of \
the OpenStack Nova API."
LICENSE = "Apache-2.0"

PV = "18.13.1"

RPM_NAME = "python313-novaclient-18.13.1-1.1.noarch.rpm"
RPM_HASH = "f09877f7c2347cec198a96c5b83500d190f534d83d8883c4eb0aeacc16c4ad539165e5203ade7b5d39b2aa7315bded0e459337ad6a0541b1c8120ed6cd31eff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-novaclient \
python3.13dist-python-novaclient \
python313-novaclient \
python3dist-python-novaclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-Babel \
python313-PrettyTable \
python313-openstacksdk \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-simplejson"

inherit rpm
