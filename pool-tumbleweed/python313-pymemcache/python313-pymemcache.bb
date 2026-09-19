SUMMARY = "A pure Python memcached client"
DESCRIPTION = "A pure-Python memcached client. \
 \
pymemcache supports the following features: \
 \
* Complete implementation of the memcached text protocol. \
* Configurable timeouts for socket connect and send/recv calls. \
* Access to the 'noreply' flag, which can significantly increase the speed of writes. \
* Flexible, simple approach to serialization and deserialization. \
* The (optional) ability to treat network and memcached errors as cache misses."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python313-pymemcache-4.0.0-4.5.noarch.rpm"
RPM_HASH = "de64125e8d5a36396c04b8dc4ed62decddcc4118cc5acf9f27ae6f50f5415d6f5b8330d1e9abf4f208071e3b07595f6f618c14ac54608c120e3c69f84694e30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymemcache \
python3.13dist-pymemcache \
python313-pymemcache \
python3dist-pymemcache"

RDEPENDS:${PN} += "python-abi"

inherit rpm
