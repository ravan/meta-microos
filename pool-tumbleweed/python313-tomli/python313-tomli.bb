SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python313-tomli-2.4.1-1.3.noarch.rpm"
RPM_HASH = "23d46387503c3e03be31e6b0e565ae0eb56a3dceb8a9349bbd5d89d342f6df101bf359f801f898e031e45e75e22e793a756babd861660762944ce3219f992189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomli \
python3.13dist-tomli \
python313-tomli \
python3dist-tomli"

RDEPENDS:${PN} += "python-abi"

inherit rpm
