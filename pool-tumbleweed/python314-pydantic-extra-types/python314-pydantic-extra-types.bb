SUMMARY = "Extra Pydantic types"
DESCRIPTION = "A growing collection of extra field types and validators for Pydantic 2, \
such as colors, coordinates, country and currency codes, phone numbers, \
payment card numbers, MAC addresses, semantic versions and more."
LICENSE = "MIT"

PV = "2.11.2"

RPM_NAME = "python314-pydantic-extra-types-2.11.2-1.1.noarch.rpm"
RPM_HASH = "5cb8f8e0268befc89110fa4b085744ba0facc6c8b16737338214cc99376ba0fd785a7a0f498c1459214f3f45534700fd4065bb1330e1622dc927339e05ee104b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydantic-extra-types \
python314-pydantic-extra-types \
python3dist-pydantic-extra-types"

RDEPENDS:${PN} += "python-abi \
python314-pydantic \
python314-typing-extensions"

inherit rpm
