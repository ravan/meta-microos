SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python311-tomlkit-0.15.1-2.1.noarch.rpm"
RPM_HASH = "80f26df0e72dead2709009bf0ab81fb08dcb97da10111a87bb613661c5261600a8dd1cf9a2104b723a5370cde88b7433f171b7ed7624e8e412111e27cf38ef1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tomlkit \
python311-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
