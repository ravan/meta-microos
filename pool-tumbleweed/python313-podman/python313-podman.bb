SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-podman-5.8.0-1.3.noarch.rpm"
RPM_HASH = "1bca46c0b766f6e998361c6ab6ae8b503c64a1a8f8362be47e741f4f99fd6e7d52b6f0712ec57a0a13e1eafd4ab6939bc8d3c1f5049ae2d3376f9795a9ee6a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podman \
python3.13dist-podman \
python313-podman \
python3dist-podman"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-urllib3"

inherit rpm
