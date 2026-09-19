SUMMARY = "Client for the Barbican Key Management API"
DESCRIPTION = "This is a client for the Barbican Key Management API. This package includes a \
Python library for accessing the API (the barbicanclient module), and a \
command-line script (barbican)."
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python313-barbicanclient-7.6.0-1.1.noarch.rpm"
RPM_HASH = "b0ce488d920f39ad218b71b0373403f6494efab67d346e212fa88920414100b6c1e759c74b63a7f22389ca60f7e81b240324e8120f04faacdd9d84ec294fdd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-barbicanclient \
python3.13dist-python-barbicanclient \
python313-barbicanclient \
python3dist-python-barbicanclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-cliff \
python313-keystoneauth1 \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-pbr \
python313-requests"

inherit rpm
