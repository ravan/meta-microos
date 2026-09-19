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

RPM_NAME = "python313-yamlloader-1.6.0-1.3.noarch.rpm"
RPM_HASH = "08572d5bac5f420577af9e79f8d281549717eb4d552a48e1bd868c53af9a1fca8b12c42180ed429f2865692af4de1cd6962c27575a89ee41990c6f1591332900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamlloader \
python3.13dist-yamlloader \
python313-yamlloader \
python3dist-yamlloader"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
