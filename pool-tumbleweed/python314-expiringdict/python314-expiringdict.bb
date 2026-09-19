SUMMARY = "Dictionary with auto-expiring values for caching purposes"
DESCRIPTION = "The core of the library is ExpiringDict class which is an ordered \
dictionary with auto-expiring values for caching purposes. \
Expiration happens on any access, object is locked during cleanup \
from expired values. ExpiringDict can not store more than \
max_len elements - the oldest will be deleted."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python314-expiringdict-1.2.2-3.5.noarch.rpm"
RPM_HASH = "3b838fa9a77d9e5f7b01ed9f62e534587fe0739011fdff38026299864526b344c2c35c90ff4f0c464d518cea00f733a104f6f3e1c8c99563a710d6c142d335e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-expiringdict \
python314-expiringdict \
python3dist-expiringdict"

RDEPENDS:${PN} += "python-abi \
python314-dill \
python314-typing"

inherit rpm
