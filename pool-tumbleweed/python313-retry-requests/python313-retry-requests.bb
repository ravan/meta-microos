SUMMARY = "Make requests's sessions auto-retry on failure"
DESCRIPTION = "Make requests's sessions auto-retry on failure."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python313-retry-requests-2.0.0-1.4.noarch.rpm"
RPM_HASH = "9123fb3d63e3bd25b22352edc6493aa6d9ec81084591e3bf4235c69c54171b5c540ec3b9ea3db2d12cff7094570e39560b6838cf9cb0c8f22e6d83971624f8b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retry-requests \
python3.13dist-retry-requests \
python313-retry-requests \
python3dist-retry-requests"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-urllib3"

inherit rpm
