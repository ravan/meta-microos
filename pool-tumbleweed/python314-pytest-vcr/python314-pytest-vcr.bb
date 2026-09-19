SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python314-pytest-vcr-1.0.2-3.5.noarch.rpm"
RPM_HASH = "6fe89619a2abd1acce6ef96fec9b4ef5994dc8fb3677037d1c584a6cca6374f124ba071fe62b86cf64f594b295fbe6286d9c9e7df8b191365214391f86c5bd4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-vcr \
python314-pytest-vcr \
python3dist-pytest-vcr"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-vcrpy"

inherit rpm
