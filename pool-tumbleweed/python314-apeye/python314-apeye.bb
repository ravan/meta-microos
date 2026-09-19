SUMMARY = "Handy tools for working with URLs and APIs"
DESCRIPTION = "Handy tools for working with URLs and APIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "python314-apeye-1.4.1-2.7.noarch.rpm"
RPM_HASH = "7acb455f77ccf87dcc8078f026afd5c0e21729f46d4890cf7a9116a1fa9ccf1da6d1d3eb7bffbb1b8d6c53e3999763e1efe4a57e9f087265f923bdf34a172202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apeye \
python314-apeye \
python3dist-apeye"

RDEPENDS:${PN} += "python-abi \
python314-apeye-core \
python314-domdf-python-tools \
python314-platformdirs \
python314-requests"

inherit rpm
