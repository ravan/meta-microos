SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python313-hyperlink-21.0.0-3.5.noarch.rpm"
RPM_HASH = "066ce7b2ad71897d257ca5fc7ab656a537341ac3a00b36876e5014d1ed2fcff9ca9b1fd87ae985e9d12dd5146bb83afd0c003884c7dcf7fdf7d1e7a40dade7aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hyperlink \
python3.13dist-hyperlink \
python313-hyperlink \
python3dist-hyperlink"

RDEPENDS:${PN} += "python-abi \
python313-idna"

inherit rpm
