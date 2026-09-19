SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python313-babelfish-0.6.1-2.5.noarch.rpm"
RPM_HASH = "7bc669d50bf5ce6a26406a962cec04eb116e2f958f76e03fe187aad2e0a3237e965b9a450573e6f74e1c543471886ce40129326f6c05c6748643eeeff2535911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-babelfish \
python3.13dist-babelfish \
python313-babelfish \
python3dist-babelfish"

RDEPENDS:${PN} += "python-abi"

inherit rpm
