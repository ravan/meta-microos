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

RPM_NAME = "python314-pymemcache-4.0.0-4.5.noarch.rpm"
RPM_HASH = "5e21b3bcefb90b0f09b2f52daafce2c9a98a6af01d8d08ed58901bc71fa1982d8a2be74bf1dec48ec0744876e23f7d89b756e4cd330fe0834abb9456ffd73956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymemcache \
python314-pymemcache \
python3dist-pymemcache"

RDEPENDS:${PN} += "python-abi"

inherit rpm
