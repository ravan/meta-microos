SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python313-jsonschema-path-0.5.0-1.2.noarch.rpm"
RPM_HASH = "ae6dabbba6a52e6bb2711b7d4507b1b04bc9911c80145ecfb9e30498444c423713009ed4b99be26f4426162c88f1ea4847e1a23966e763a0c280da0706e02543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-path \
python3.13dist-jsonschema-path \
python313-jsonschema-path \
python3dist-jsonschema-path"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-attrs \
python313-pathable \
python313-referencing"

inherit rpm
