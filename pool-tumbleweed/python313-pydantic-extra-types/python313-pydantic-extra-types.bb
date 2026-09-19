SUMMARY = "Extra Pydantic types"
DESCRIPTION = "A growing collection of extra field types and validators for Pydantic 2, \
such as colors, coordinates, country and currency codes, phone numbers, \
payment card numbers, MAC addresses, semantic versions and more."
LICENSE = "MIT"

PV = "2.11.2"

RPM_NAME = "python313-pydantic-extra-types-2.11.2-1.1.noarch.rpm"
RPM_HASH = "5e1b7e0f58a0a5eb4b3bd3ab742753621863b6dd8971d594dc450db9b2ebd9e1d3dfa7c18255028d7921d0f41a9e81fd95b9220073736a0c7f61a2083dc2a027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydantic-extra-types \
python3.13dist-pydantic-extra-types \
python313-pydantic-extra-types \
python3dist-pydantic-extra-types"

RDEPENDS:${PN} += "python-abi \
python313-pydantic \
python313-typing-extensions"

inherit rpm
