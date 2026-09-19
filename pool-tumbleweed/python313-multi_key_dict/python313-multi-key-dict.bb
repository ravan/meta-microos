SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python313-multi_key_dict-2.0.3-5.5.noarch.rpm"
RPM_HASH = "52e2b3e60ab437865beea87bdc5e364cf1fda1e5097d41f2a7352997dd31a6ed66530e876a43b22be2b29b023ac66a38cbb1847470bba715230b4f00505b47e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multi-key-dict \
python3.13dist-multi-key-dict \
python313-multi-key-dict \
python3dist-multi-key-dict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
