SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.5.7"

RPM_NAME = "python314-python-jsonschema-objects-0.5.7-1.5.noarch.rpm"
RPM_HASH = "3c53d26899283f968b63b187018c89a2697e6c70b52ec378114865e83876f9c88b054108cb30c35a0b013c6706975f166736ff0bf95dbe0be23fd620fca686b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-jsonschema-objects \
python314-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "python-abi \
python314-Markdown \
python314-inflection \
python314-jsonschema"

inherit rpm
