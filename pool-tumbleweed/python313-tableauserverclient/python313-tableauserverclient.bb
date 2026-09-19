SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.41"

RPM_NAME = "python313-tableauserverclient-0.41-1.2.noarch.rpm"
RPM_HASH = "fe2c35889b850e7e60798a666125c5c4d129b9bd32d4f92c94b79a32c88d123f33b48ae29c0b8c8b9d018f3ddc4eb6de6bf188186d388050d428f17542a959e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tableauserverclient \
python3.13dist-tableauserverclient \
python313-tableauserverclient \
python3dist-tableauserverclient"

RDEPENDS:${PN} += "python-abi \
python313-defusedxml \
python313-packaging \
python313-requests \
python313-typing-extensions \
python313-urllib3"

inherit rpm
