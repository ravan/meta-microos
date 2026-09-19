SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.26.0"

RPM_NAME = "python314-jsonschema-format-4.26.0-1.5.noarch.rpm"
RPM_HASH = "ea9971d8aca7be5d6b9bb49fb6d14b62ab38597814de425729592b0f5c3c7dbeabb0d32bef2dcd67cd53f12925a53f4a4b0dba27ac7c934e39c9cfb0d5029f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-jsonschema-format"

RDEPENDS:${PN} += "python314-fqdn \
python314-idna \
python314-isoduration \
python314-jsonpointer \
python314-jsonschema \
python314-rfc3339-validator \
python314-rfc3987 \
python314-uri-template \
python314-webcolors"

inherit rpm
