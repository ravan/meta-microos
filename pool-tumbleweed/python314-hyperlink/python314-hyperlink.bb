SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python314-hyperlink-21.0.0-3.5.noarch.rpm"
RPM_HASH = "44f339d23882bc5b45b7f0d5e6e31584ad5e5ee752810333e90fdc7e52882e9d1c3d198c4626267032579621712ad6594aff82259e29bee564684244a92cf303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hyperlink \
python314-hyperlink \
python3dist-hyperlink"

RDEPENDS:${PN} += "python-abi \
python314-idna"

inherit rpm
