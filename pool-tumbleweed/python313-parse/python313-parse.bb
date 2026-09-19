SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "python313-parse-1.21.1-1.4.noarch.rpm"
RPM_HASH = "5b8b840ec3e486f65ebe321fac6ef60b7009eb00e9addec8cb6551249332a7ed21b7ea4e6b6e8b41710fff0e38538643ce50863dfe5cc51c9c89e4fe1ebbd66d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parse \
python3.13dist-parse \
python313-parse \
python3dist-parse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
