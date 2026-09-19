SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python314-tomli-2.4.1-1.3.noarch.rpm"
RPM_HASH = "bb5e1161f74ab50979e283bee68c03f4e80259154fa12feeceb29ff2c31b0bc0efc659e65780aa640a100aa2efc763b4da3d858d18ca86b966377c0c95df88a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tomli \
python314-tomli \
python3dist-tomli"

RDEPENDS:${PN} += "python-abi"

inherit rpm
