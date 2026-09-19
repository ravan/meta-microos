SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.26.0"

RPM_NAME = "python314-jsonschema-4.26.0-1.5.noarch.rpm"
RPM_HASH = "a1d41e249601bce513fdc846c807e819a1a372dd824efe7b1dd08d295f67c36adeaa5cf2026944af0b7e61e0d5a25456197ac15a6d579cbe93e95974cc8339b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonschema \
python314-jsonschema \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs \
python314-jsonschema-specifications \
python314-referencing \
python314-rpds-py"

inherit rpm
