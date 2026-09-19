SUMMARY = "Gherkin parser (official, by Cucumber team)"
DESCRIPTION = "Parser and compiler for the Gherkin language."
LICENSE = "MIT"

PV = "42.0.1"

RPM_NAME = "python313-gherkin-official-42.0.1-1.1.noarch.rpm"
RPM_HASH = "b8314975b783dae371e86ff1de767e8a51d9212902b227275c75dadd7cfef1996c43cacf33696d015042ed9a04cdb82c19f862642677a4e3a0502a853d1cbc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gherkin \
python3-gherkin-official \
python3.13dist-gherkin-official \
python313-gherkin \
python313-gherkin-official \
python3dist-gherkin-official"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
