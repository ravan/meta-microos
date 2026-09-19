SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python313-jaraco.stream-3.0.4-2.5.noarch.rpm"
RPM_HASH = "2d31824775114f840f430ed47c0c98899955dbdf2347cd772906fdd9b35dee8ef016f3ba63b217e917b0383bacd3d28f7caed677e2c8bdfe62e3b45b9e11d70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.stream \
python3.13dist-jaraco.stream \
python313-jaraco.stream \
python3dist-jaraco.stream"

RDEPENDS:${PN} += "python-abi \
python313-more-itertools"

inherit rpm
