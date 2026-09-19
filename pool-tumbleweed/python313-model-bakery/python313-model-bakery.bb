SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.23.4"

RPM_NAME = "python313-model-bakery-1.23.4-1.4.noarch.rpm"
RPM_HASH = "951d232148a99c212ff73465323de4acd82d0ee0666bd104a03d80bd05921208e80d6bd0758f4db020bba982500707d64cd04f4604e3d74337dc8f21a39cdc83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-model-bakery \
python3.13dist-model-bakery \
python313-model-bakery \
python3dist-model-bakery"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
