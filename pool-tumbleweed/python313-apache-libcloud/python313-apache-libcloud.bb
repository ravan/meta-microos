SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "python313-apache-libcloud-3.9.0-2.3.noarch.rpm"
RPM_HASH = "9a079ea3eb6786b9e35fc6fbc9e342961b6e8b683872f13eba339ca75ad9b79dd83c4cc264332548b65ab1904890bbef902a79b8995d00dfd1a10ee4a63b1a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apache-libcloud \
python3.13dist-apache-libcloud \
python313-apache-libcloud \
python3dist-apache-libcloud"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
