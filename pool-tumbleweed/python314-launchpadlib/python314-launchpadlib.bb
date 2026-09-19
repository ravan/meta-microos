SUMMARY = "Python client library for Launchpad's web service"
DESCRIPTION = "launchpadlib is an open-source Python library that lets you treat the HTTP resources published by \
Launchpad's web service as Python objects responding to a standard set of commands. With launchpadlib \
you can integrate your applications into Launchpad without knowing a lot about HTTP client programming."
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python314-launchpadlib-2.1.0-1.5.noarch.rpm"
RPM_HASH = "942f1af3bd9751c2f529e79f7baaba0e0201c2b1107824711bc79cca2585af945718ee38f762ee5c881f199ff7b91f71a6a320422e0da46ce1671011a1f20e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-launchpadlib \
python314-launchpadlib \
python3dist-launchpadlib"

RDEPENDS:${PN} += "python-abi \
python314-httplib2 \
python314-lazr.restfulclient \
python314-lazr.uri"

inherit rpm
