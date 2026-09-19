SUMMARY = "OpenAPI (v3) specification schema as Pydantic classes"
DESCRIPTION = "OpenAPI (v3) specification schema expressed as Pydantic classes, for \
parsing, validating and generating OpenAPI documents in Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-openapi-pydantic-0.5.1-1.2.noarch.rpm"
RPM_HASH = "36edc1bbade4c20a95c07823c5eff25fad0b8989c4077b705b7d64050bf058bf198a1432b470319940a12c8720d4a60efb3ab31f37b0614f0801bb0f2c961be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-pydantic \
python3.13dist-openapi-pydantic \
python313-openapi-pydantic \
python3dist-openapi-pydantic"

RDEPENDS:${PN} += "python-abi \
python313-pydantic"

inherit rpm
