SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-pytest-black-0.6.0-2.4.noarch.rpm"
RPM_HASH = "635c8074650bc6587757d217d966afc6eb02b89d404dc80b78443d264493ac875a7254578095eb039d140aa01538f15136fba5635f563ce868ac8523b1a123a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-black \
python3.13dist-pytest-black \
python313-pytest-black \
python3dist-pytest-black"

RDEPENDS:${PN} += "python-abi \
python313-black \
python313-pytest \
python313-toml"

inherit rpm
