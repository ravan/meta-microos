SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.37.1"

RPM_NAME = "python314-fakeredis-2.37.1-1.1.noarch.rpm"
RPM_HASH = "ffb5cddda2ad00c27786e8dbe8be6b774f6a9e4a10400c132448e9a80b1437272a5809803b9db9165ef7c0042c3b83a4e4d140c4061050f53e05b784e89c654b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fakeredis \
python314-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python314-redis \
python314-sortedcontainers"

inherit rpm
