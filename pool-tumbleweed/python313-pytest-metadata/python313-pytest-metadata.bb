SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "3.1.1"

RPM_NAME = "python313-pytest-metadata-3.1.1-1.11.noarch.rpm"
RPM_HASH = "0a986a8ec1cbc28a497876e719e53fe6c9b08520e38ebe5215ab3c1c4cf12d9289b0975c41af924b7d03514bdb1aae125df6e77022875ff13296ed811bd764ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-metadata \
python3.13dist-pytest-metadata \
python313-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
