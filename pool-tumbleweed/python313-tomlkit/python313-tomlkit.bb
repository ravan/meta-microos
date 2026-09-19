SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python313-tomlkit-0.15.1-2.1.noarch.rpm"
RPM_HASH = "d6bae591dace3349acac141e135fd893d7dfe5c63f96432a6525607b3be6f067f4c643549457af4acc9697b7d9813755d96bb39b43c73d6e7ce654b45a0d0366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomlkit \
python3.13dist-tomlkit \
python313-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
