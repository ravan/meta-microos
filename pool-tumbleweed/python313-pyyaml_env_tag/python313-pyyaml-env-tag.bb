SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python313-pyyaml_env_tag-1.1-1.4.noarch.rpm"
RPM_HASH = "5a2d7e21e03f0f19a7203b90e8fe8e0f078e9bf447013b03de4bf5a60610a443633073e038daeeea5bbea78d89e34016a6634a88899ac264d4094a699ca94398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyyaml-env-tag \
python3.13dist-pyyaml-env-tag \
python313-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
