SUMMARY = "Python API and CLI for OpenStack Glance"
DESCRIPTION = "This is a client for the OpenStack Glance API. There's a Python API (the \
glanceclient module), and a command-line script (glance). Each implements \
100% of the OpenStack Glance API."
LICENSE = "Apache-2.0"

PV = "4.13.0"

RPM_NAME = "python313-glanceclient-4.13.0-1.1.noarch.rpm"
RPM_HASH = "b71dc6f28288d8745227eb0b29edafce803188d35441f2df9d990ef42aa82ddb8c90e2b84adfb4b418039b12fcdc85e8348b6b121f5979221fb2f3e9a7f97064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glanceclient \
python3.13dist-python-glanceclient \
python313-glanceclient \
python3dist-python-glanceclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-PrettyTable \
python313-keystoneauth1 \
python313-oslo.i18n \
python313-oslo.utils \
python313-pbr \
python313-pyOpenSSL \
python313-requests \
python313-warlock \
python313-wrapt"

inherit rpm
