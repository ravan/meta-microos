SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.5.7"

RPM_NAME = "python313-python-jsonschema-objects-0.5.7-1.5.noarch.rpm"
RPM_HASH = "b40dd57173869ad7cfd05316a37d3898cb9921a07fd5dd4d8be068989e189bd26eeb7bde4f60b014529b20f8828abc08ccf0b198cfeb95c86e4d76ec5b4fa36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jsonschema-objects \
python3.13dist-python-jsonschema-objects \
python313-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "python-abi \
python313-Markdown \
python313-inflection \
python313-jsonschema"

inherit rpm
