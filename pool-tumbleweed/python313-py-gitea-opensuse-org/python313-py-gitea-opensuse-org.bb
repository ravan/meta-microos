SUMMARY = "Gitea API"
DESCRIPTION = "Python wrapper for src.opensuse.org"
LICENSE = "MIT"

PV = "1.22.4"

RPM_NAME = "python313-py-gitea-opensuse-org-1.22.4-1.7.noarch.rpm"
RPM_HASH = "3a1d960ebb2e8110397fdb3999a9e6ff5e66a50e83cb04c9896188878fb0f09994e06d0c6d9ee660dcd27230f4973728c8ae42b4ce9d6dd5635a7688e510b6a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-gitea-opensuse-org \
python3.13dist-py-gitea-opensuse-org \
python313-py-gitea-opensuse-org \
python3dist-py-gitea-opensuse-org"

RDEPENDS:${PN} += "python-abi \
python313-aenum \
python313-aiohttp \
python313-aiohttp-retry \
python313-pydantic \
python313-python-dateutil \
python313-urllib3"

inherit rpm
