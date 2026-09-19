SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.26.0"

RPM_NAME = "python313-jsonschema-format-4.26.0-1.5.noarch.rpm"
RPM_HASH = "a9a65620a25668d8d464775589218e591ea1d273ed6f3e3f1e9ae353da142c291c6563f57303de2a26c538264c429512f7902b6b4082104da38bfc6c481ad79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format \
python313-jsonschema-format"

RDEPENDS:${PN} += "python313-fqdn \
python313-idna \
python313-isoduration \
python313-jsonpointer \
python313-jsonschema \
python313-rfc3339-validator \
python313-rfc3987 \
python313-uri-template \
python313-webcolors"

inherit rpm
