SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python314-calmjs.parse-1.3.4-1.4.noarch.rpm"
RPM_HASH = "dc1ea2adc370b25fa8710c2c4190a32ee3d1f2b4ecd1a56b334707fe44e9a786c8ea26972dfa9e646408b49cd24adcb96fa970db4af6003af512caf915668129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-calmjs.parse \
python314-calmjs.parse \
python3dist-calmjs.parse"

RDEPENDS:${PN} += "python-abi \
python314-ply \
python314-setuptools"

inherit rpm
