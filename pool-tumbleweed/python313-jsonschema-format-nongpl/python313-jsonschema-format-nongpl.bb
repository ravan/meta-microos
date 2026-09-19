SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.26.0"

RPM_NAME = "python313-jsonschema-format-nongpl-4.26.0-1.5.noarch.rpm"
RPM_HASH = "277f7e1628b14015783a72a0d3f30066f16ad817ea881037166be63251cbee63a6ad472cdeceebc1039daa1180dca35eb6f3e5c5d3c33035a61ad4dc71111ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format-nongpl \
python313-jsonschema-format-nongpl"

RDEPENDS:${PN} += "python313-fqdn \
python313-idna \
python313-isoduration \
python313-jsonpointer \
python313-jsonschema \
python313-rfc3339-validator \
python313-rfc3986-validator \
python313-uri-template \
python313-webcolors"

inherit rpm
