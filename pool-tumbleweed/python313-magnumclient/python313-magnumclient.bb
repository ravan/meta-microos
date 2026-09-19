SUMMARY = "Python API and CLI for OpenStack Magnum"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum)."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python313-magnumclient-5.0.0-1.1.noarch.rpm"
RPM_HASH = "90e16c06c259220f2aaa81348b7861dd7f4b81f72ff8d4380fd2f27011c7afc2cf0e59dd73e4156667dd52078911a5ce2afa87c7a45e5bbd328e562ee1f3bb8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magnumclient \
python3.13dist-python-magnumclient \
python313-magnumclient \
python3dist-python-magnumclient"

RDEPENDS:${PN} += "python-abi \
python313-PrettyTable \
python313-cryptography \
python313-decorator \
python313-keystoneauth1 \
python313-osc-lib \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.serialization \
python313-oslo.utils \
python313-pbr \
python313-requests \
python313-stevedore"

inherit rpm
