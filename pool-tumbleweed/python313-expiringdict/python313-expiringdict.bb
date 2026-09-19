SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python313-expiringdict-1.2.2-3.5.noarch.rpm"
RPM_HASH = "05347c86fc3cd8e7c1f6877dfe112e67ed380fe6b16fec1c08b815dc90fbdb00948f2a1f93f55b416c6a47eb0e9a2ce697a8ec26f4ff8f01eea881a8997791ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-expiringdict \
python3.13dist-expiringdict \
python313-expiringdict \
python3dist-expiringdict"

RDEPENDS:${PN} += "python-abi \
python313-dill \
python313-typing"

inherit rpm
