SUMMARY = "Cache storage for Openstack projects"
DESCRIPTION = "oslo.cache aims to provide a generic caching mechanism for OpenStack projects \
by wrapping the dogpile.cache library. The dogpile.cache library provides \
support memoization, key value storage and interfaces to common caching \
backends such as Memcached."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python313-oslo.cache-4.3.0-1.1.noarch.rpm"
RPM_HASH = "099bf5ca3eefbd9a19679154dd92ab851533f4d98a82c7efd92ae8e9ffe2d00e3614cc6b6d2ab102328225e286fe9e073b367cabb7f78fff428b37d24f02b24f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.cache \
python3.13dist-oslo.cache \
python313-oslo.cache \
python3dist-oslo.cache"

RDEPENDS:${PN} += "python-abi \
python313-dogpile.cache \
python313-oslo.config \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.utils \
python313-python-memcached"

inherit rpm
