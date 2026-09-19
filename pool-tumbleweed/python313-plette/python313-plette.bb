SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "2.2.2"

RPM_NAME = "python313-plette-2.2.2-1.1.noarch.rpm"
RPM_HASH = "9f83a375a8a9a700e615c75518eb8b491e366a67688930b8a35979ebe18e6d52dd17bf6732c4ebfbc73c6d4b6f8730421f24e026582b1392127f049f6f8eba83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plette \
python3.13dist-plette \
python313-plette \
python3dist-plette"

RDEPENDS:${PN} += "python-abi \
python313-tomlkit"

inherit rpm
