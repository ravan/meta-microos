SUMMARY = "Pytest plugin for conditionally skipping tests"
DESCRIPTION = "It’s a collection of of useful skip markers created to simplify and reduce code \
required to skip tests in some common scenarios, for example, platform specific \
tests."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python313-pytest-skip-markers-1.5.2-1.7.noarch.rpm"
RPM_HASH = "c61f4be1b205a654849e82ffbaef2873d77f28c583fae86da255e56183d93b3a46bbfced9f7185bcf14e1275f5bf14bd5da9b01957c0d97e6fee11a72e4e7244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-skip-markers \
python3.13dist-pytest-skip-markers \
python313-pytest-skip-markers \
python3dist-pytest-skip-markers"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-distro \
python313-pytest"

inherit rpm
