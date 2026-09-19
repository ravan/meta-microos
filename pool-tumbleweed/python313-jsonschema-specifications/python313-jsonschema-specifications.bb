SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2025.9.1"

RPM_NAME = "python313-jsonschema-specifications-2025.9.1-1.5.noarch.rpm"
RPM_HASH = "d10d6b25071f8eb2a65eee6471e36914ca5cf3e304536e062174963a36f532ac84cc152b69a03201fd62ba7ae85d599f0b90565ea36c121a637f276b52ff959d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-specifications \
python3.13dist-jsonschema-specifications \
python313-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python313-referencing"

inherit rpm
