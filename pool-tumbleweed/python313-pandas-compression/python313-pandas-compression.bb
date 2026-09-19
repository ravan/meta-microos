SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-compression-3.0.5-2.2.noarch.rpm"
RPM_HASH = "14b6f6b932221c200fefc5e096c8eb5a5a91c83c3bae0fa72c314d15140c9c2c42d5c63f2e2d232a96ab1919ed629acf9d5b8af81d97534ec65d2eff1bf462b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-compression \
python313-pandas-compression"

RDEPENDS:${PN} += "python313-pandas \
python313-zstandard"

inherit rpm
