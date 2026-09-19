SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python312-tomlkit-0.15.1-2.1.noarch.rpm"
RPM_HASH = "5e7261d7b55f1519a153bca761f401b5592c1bbe697cdd0058eb9f11ffbc91a5f4ba272eaf53ee4a218d15a6d32052cf612ce122b508c17bf2009de956cc8bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-tomlkit \
python312-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
