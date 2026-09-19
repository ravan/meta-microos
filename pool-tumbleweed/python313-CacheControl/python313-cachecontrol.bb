SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.14.4"

RPM_NAME = "python313-CacheControl-0.14.4-1.5.noarch.rpm"
RPM_HASH = "9a2f313e615b31c1f27b54c8587cae76c8ff69348642ce3521a434c39bb3046d9f92d21d03061cdef103f0f9dcadd8e6bdd9f948b8398dc78097f216596060d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CacheControl \
python3-cachecontrol \
python3.13dist-cachecontrol \
python313-CacheControl \
python313-cachecontrol \
python3dist-cachecontrol"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-msgpack \
python313-requests"

inherit rpm
