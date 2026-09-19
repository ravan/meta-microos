SUMMARY = "Access dict values as attributes (works recursively)"
DESCRIPTION = "EasyDict allows accessing dict values as attributes (works \
recursively). It provides Javascript-like properties dot notation \
for Python dicts."
LICENSE = "LGPL-3.0-only"

PV = "1.13"

RPM_NAME = "python313-easydict-1.13-1.1.noarch.rpm"
RPM_HASH = "14054bf1103eea6ad66bf69bd7d1a318205cc720fb027c4099f899d5606d006dbb42ceec603263bd1106eb0b49e25fec7baa2847f088c18c630a2ef73053e62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easydict \
python3.13dist-easydict \
python313-easydict \
python3dist-easydict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
