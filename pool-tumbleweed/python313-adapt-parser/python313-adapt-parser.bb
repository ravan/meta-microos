SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python313-adapt-parser-1.0.0-4.5.noarch.rpm"
RPM_HASH = "c5fd0d3351c0510c34f55a4a59b171bc25540e374f8fd8e913fdcf449e91f74d04cb13e7202812017d23859522f491b825afeb6125951a4e4c12be4a9beddc6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-adapt-parser \
python3.13dist-adapt-parser \
python313-adapt-parser \
python3dist-adapt-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
