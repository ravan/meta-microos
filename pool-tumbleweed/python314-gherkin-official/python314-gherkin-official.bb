SUMMARY = "Gherkin parser (official, by Cucumber team)"
DESCRIPTION = "Parser and compiler for the Gherkin language."
LICENSE = "MIT"

PV = "42.0.1"

RPM_NAME = "python314-gherkin-official-42.0.1-1.1.noarch.rpm"
RPM_HASH = "a37ef3472c81012b0c700faadbff20d5ca9a5565cad0be0a9948ec017aad6f0979d5de812106356e1c14c2d5f19a4e0503150c8fe890d6f337fa0dc2e1fb51b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gherkin-official \
python314-gherkin \
python314-gherkin-official \
python3dist-gherkin-official"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
