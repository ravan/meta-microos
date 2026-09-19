SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python314-jsonschema-path-0.5.0-1.2.noarch.rpm"
RPM_HASH = "4cc02ac9cf1b0522ea3408ea1c7f365e8966aaecfa21ac01a7101789c52b448a34bff485a5760883419849b3ae786a7f196d3c3b184d75beb0ba9306466ba852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonschema-path \
python314-jsonschema-path \
python3dist-jsonschema-path"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-attrs \
python314-pathable \
python314-referencing"

inherit rpm
