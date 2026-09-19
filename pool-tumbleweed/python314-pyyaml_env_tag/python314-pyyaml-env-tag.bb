SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python314-pyyaml_env_tag-1.1-1.4.noarch.rpm"
RPM_HASH = "386a211fd923ebb0835f725a99631113f51661f651e3a9388d6271afdf8ddf6ffe8fd69c731d3ad42eae1b69df993db5bc652848fa58e7e2e2b37fa4ab474dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyyaml-env-tag \
python314-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
