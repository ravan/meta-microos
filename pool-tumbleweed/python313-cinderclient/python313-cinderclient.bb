SUMMARY = "Python API and CLI for OpenStack Cinder"
DESCRIPTION = "This is a client for the OpenStack Cinder API (Block Storage. There's a \
Python API (the cinderclient module), and a command-line script (cinder). \
Each implements 100% of the OpenStack Cinder API."
LICENSE = "Apache-2.0"

PV = "9.10.0"

RPM_NAME = "python313-cinderclient-9.10.0-1.1.noarch.rpm"
RPM_HASH = "cc52c897585119a1b25a0288abb9ccafad6683f79b575acbbdeec56dd65ebde71927900b3daf0cfc674127372da7af7517ca984f9c9eed51555f762727fa5861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cinderclient \
python3.13dist-python-cinderclient \
python313-cinderclient \
python3dist-python-cinderclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-Babel \
python313-PrettyTable \
python313-keystoneauth1 \
python313-oslo.i18n \
python313-oslo.utils \
python313-requests"

inherit rpm
