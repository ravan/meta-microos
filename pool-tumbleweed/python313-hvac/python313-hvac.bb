SUMMARY = "HashiCorp Vault API client"
DESCRIPTION = "HashiCorp Vault API client for Python 2/3"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python313-hvac-2.4.0-1.4.noarch.rpm"
RPM_HASH = "fcc5f8c2b4f43e6cd8c96fbcf41cf0e287ada6e04e7821edab03a95d9bce46e9786ba71ba6c4ddb3b7d495c2a5a0e878771938082a575f7a513bfbcae6ee3685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hvac \
python3.13dist-hvac \
python313-hvac \
python3dist-hvac"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
