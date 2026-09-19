SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.26.0"

RPM_NAME = "python314-jsonschema-format-nongpl-4.26.0-1.5.noarch.rpm"
RPM_HASH = "b2cac3475a0f6f5928b74ea9ca31af818983eaa61b60111dcfc888357b7d01163ae8342ac758b1611bc20da54b98f8cfc7f1e61c53633284279df44083e31478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-jsonschema-format-nongpl"

RDEPENDS:${PN} += "python314-fqdn \
python314-idna \
python314-isoduration \
python314-jsonpointer \
python314-jsonschema \
python314-rfc3339-validator \
python314-rfc3986-validator \
python314-uri-template \
python314-webcolors"

inherit rpm
