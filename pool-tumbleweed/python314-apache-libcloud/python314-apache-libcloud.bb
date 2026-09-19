SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "python314-apache-libcloud-3.9.0-2.3.noarch.rpm"
RPM_HASH = "50b9376a011d2842c89f67bc52c4432cb364e79996404d3448474e42b436e337708fcb10b5faf252fb28098e0354d2dc6650c6c97443574c0ed2a1db3e2b6de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apache-libcloud \
python314-apache-libcloud \
python3dist-apache-libcloud"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
