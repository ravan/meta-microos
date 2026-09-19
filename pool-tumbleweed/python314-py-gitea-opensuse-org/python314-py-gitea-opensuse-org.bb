SUMMARY = "Gitea API"
DESCRIPTION = "Python wrapper for src.opensuse.org"
LICENSE = "MIT"

PV = "1.22.4"

RPM_NAME = "python314-py-gitea-opensuse-org-1.22.4-1.7.noarch.rpm"
RPM_HASH = "02d9004bbe035a0ee6c22080fed1d88119104a82fd4a15571a51712075411efe1e914c696a2035a3441595522b23e0aefcc67bc731b20a54b3e851efc681f60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-gitea-opensuse-org \
python314-py-gitea-opensuse-org \
python3dist-py-gitea-opensuse-org"

RDEPENDS:${PN} += "python-abi \
python314-aenum \
python314-aiohttp \
python314-aiohttp-retry \
python314-pydantic \
python314-python-dateutil \
python314-urllib3"

inherit rpm
