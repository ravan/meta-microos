SUMMARY = "YAML 1.2 Support for PyYAML"
DESCRIPTION = "YAML 1.2 Support for PyYAML \
 \
This module can be used on top of PyYAML to load YAML 1.2 files. It depends on \
PyYAML and inherits from it, it's not a fork. \
 \
Currently it supports enabling all YAML 1.2 Core Schema tags on top of the \
PyYAML BaseLoader. It does not (yet) support other tags like the << merge key. \
You can add custom constructors, though."
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python314-yamlcore-0.0.4-1.9.noarch.rpm"
RPM_HASH = "6c10ce88ee3e7e055f6c47a9a60ea4f02a3ba4be805903c7e255c6998d909f754ce3302217dd1ab44581b7d4c2b25ca4c448c580e6b3c784e31f4edd237a082a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yamlcore \
python314-yamlcore \
python3dist-yamlcore"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
