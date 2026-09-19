SUMMARY = "Saves and loads to the cache a transformed versions of a source object"
DESCRIPTION = "Saves and loads to the cache a transformed versions of a source object."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python313-flexcache-0.3-3.4.noarch.rpm"
RPM_HASH = "4b615d776a5877f23c57a9634a9aebd18c8acdc14c60a5a34c4caa9d4305e446fa6d5822d971e8244eec808ac2be852877df7e1bd1b13681c24c11eee9fc21d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexcache \
python3.13dist-flexcache \
python313-flexcache \
python3dist-flexcache"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
