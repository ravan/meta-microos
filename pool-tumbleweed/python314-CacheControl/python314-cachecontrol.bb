SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.14.4"

RPM_NAME = "python314-CacheControl-0.14.4-1.5.noarch.rpm"
RPM_HASH = "b408321df67ef5560c197027999cf976f9515aa88951bc12662e23835b5d7a23adfa5925edae1b436a7d4bb56cc01711dac1e7bf1b380d46101e368137ff8070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cachecontrol \
python314-CacheControl \
python314-cachecontrol \
python3dist-cachecontrol"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-msgpack \
python314-requests"

inherit rpm
