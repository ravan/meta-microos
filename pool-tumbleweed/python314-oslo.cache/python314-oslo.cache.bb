SUMMARY = "Cache storage for Openstack projects"
DESCRIPTION = "oslo.cache aims to provide a generic caching mechanism for OpenStack projects \
by wrapping the dogpile.cache library. The dogpile.cache library provides \
support memoization, key value storage and interfaces to common caching \
backends such as Memcached."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python314-oslo.cache-4.3.0-1.1.noarch.rpm"
RPM_HASH = "1164b1ee9b052f3d99fdd9a2a5c8d641b5ca53ef83ba9114bc3e97da9d9d9b6dbc4e1eca252e4f4429574096db57dfbd15ebf86cfe3b8058c4125d0657999ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.cache \
python314-oslo.cache \
python3dist-oslo.cache"

RDEPENDS:${PN} += "python-abi \
python314-dogpile.cache \
python314-oslo.config \
python314-oslo.i18n \
python314-oslo.log \
python314-oslo.utils \
python314-python-memcached"

inherit rpm
