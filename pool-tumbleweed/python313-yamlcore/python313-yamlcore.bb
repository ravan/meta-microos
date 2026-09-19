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

RPM_NAME = "python313-yamlcore-0.0.4-1.9.noarch.rpm"
RPM_HASH = "46081c48fa504337c1660ecc654b582f5e3dd83b93967be82bb88b4cb79433100d1fbbfc33835baaa46bb3a00f288191160cb1eba17062be54a56f6315ff072a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamlcore \
python3.13dist-yamlcore \
python313-yamlcore \
python3dist-yamlcore"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
