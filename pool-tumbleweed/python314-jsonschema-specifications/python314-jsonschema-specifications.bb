SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2025.9.1"

RPM_NAME = "python314-jsonschema-specifications-2025.9.1-1.5.noarch.rpm"
RPM_HASH = "6fd18987b4df4a49c39e1e55acb3b1ac73c2ce94d00bbe9ba13633f69234f49b21e5c0ff49a7ba2ec5e2c40928f985003c6fc481a605597ed3cb24cbfd0a0d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonschema-specifications \
python314-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python314-referencing"

inherit rpm
