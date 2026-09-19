SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python313-habanero-2.4.0-1.2.noarch.rpm"
RPM_HASH = "06a966672f070516adfa1f77d32416f2b31fcb838a399b4ca175165e0a452ae81751e74ed9d568047667fdc7a3316d5205a19f8100493a53dd3b2497a7195c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-habanero \
python3.13dist-habanero \
python313-habanero \
python3dist-habanero"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-packaging \
python313-tqdm \
python313-urllib3"

inherit rpm
