SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python313-requirements-parser-0.13.0-1.2.noarch.rpm"
RPM_HASH = "ee1ddacd6136b16080ec21edd8709f0ed53506b0ccac543d711e80630df746492fbb77be6565be564074e276503ac1421c61248917470c398a54fa349541ee22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requirements-parser \
python3.13dist-requirements-parser \
python313-requirements-parser \
python3dist-requirements-parser"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
