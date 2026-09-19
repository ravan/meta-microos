SUMMARY = "Ordered YAML loader and dumper for PyYAML"
DESCRIPTION = "This module provides loaders and dumpers for PyYAML. Currently, an \
OrderedDict loader/dumper is implemented, allowing to keep items order \
when loading resp. dumping a file from/to an OrderedDict (Python 3.7: \
Also regular dicts are supported and are the default items to be loaded \
to. As of Python 3.7 preservation of insertion order is a language \
feature of regular dicts.) \
 \
[API Documentation](https://phynix.github.io/yamlloader/index.html)."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-yamlloader-1.6.0-1.3.noarch.rpm"
RPM_HASH = "f98ecea064b6e045ecd8425151d7e62ceb36a55a2a4fb5e23f89c6398f0e40526387ff1509a2d983486447a15faaf11e004f305d96dbec08d384ed5abcc47430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yamlloader \
python314-yamlloader \
python3dist-yamlloader"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
