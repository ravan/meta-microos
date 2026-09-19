SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.26.0"

RPM_NAME = "python313-jsonschema-4.26.0-1.5.noarch.rpm"
RPM_HASH = "da12bb66de6aa1dea2dbf1a4522341efea2f8d8cf8cb7d34f08b701268236d507e6bfca7d64640c27fe83fed52d743f4f44132e3458df713b6081b53f26cc7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema \
python3.13dist-jsonschema \
python313-jsonschema \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs \
python313-jsonschema-specifications \
python313-referencing \
python313-rpds-py"

inherit rpm
