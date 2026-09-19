SUMMARY = "Python client library for Launchpad's web service"
DESCRIPTION = "launchpadlib is an open-source Python library that lets you treat the HTTP resources published by \
Launchpad's web service as Python objects responding to a standard set of commands. With launchpadlib \
you can integrate your applications into Launchpad without knowing a lot about HTTP client programming."
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python313-launchpadlib-2.1.0-1.5.noarch.rpm"
RPM_HASH = "666f3229bec87fbb1531c8fe7ecc2630c1e59671bbf5c0daed3f2850e899884fd172f31bbbd806f1f887847819e5d12cddca8ceb072cdc075a4fa6b23f5af3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-launchpadlib \
python3.13dist-launchpadlib \
python313-launchpadlib \
python3dist-launchpadlib"

RDEPENDS:${PN} += "python-abi \
python313-httplib2 \
python313-lazr.restfulclient \
python313-lazr.uri"

inherit rpm
