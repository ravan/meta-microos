SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-colorlover-0.3.0-2.5.noarch.rpm"
RPM_HASH = "32fa1297b3cd39adec928900cb6a56c6024fe034c93391355a02720578b2bb7b0ee96e410df4a73712e7766463235ac21c1956538a95becc2892b07874d3e17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorlover \
python3.13dist-colorlover \
python313-colorlover \
python3dist-colorlover"

RDEPENDS:${PN} += "python-abi"

inherit rpm
