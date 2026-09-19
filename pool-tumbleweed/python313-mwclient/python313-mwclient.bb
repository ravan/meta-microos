SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python313-mwclient-0.11.0-1.6.noarch.rpm"
RPM_HASH = "d6eda5e500bb548d93d2ba319c821a720a0e8f9e3a34b1a9ae6266c8cf7944b3b391b815f41d6fb68c2b558366b40251b340f8ff73cfd42f31f5ca6af8427fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mwclient \
python3.13dist-mwclient \
python313-mwclient \
python3dist-mwclient"

RDEPENDS:${PN} += "python-abi \
python313-requests-oauthlib"

inherit rpm
