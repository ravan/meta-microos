SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python314-multi_key_dict-2.0.3-5.5.noarch.rpm"
RPM_HASH = "19536fae5725abfbaf0c758504a20dd7f57ac5405bbe2495f67a177121ed2cb06fa48c42564ebcbc43ee2e5f7f602c2f16774c1182187bd00bf95860d79d6073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-multi-key-dict \
python314-multi-key-dict \
python3dist-multi-key-dict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
