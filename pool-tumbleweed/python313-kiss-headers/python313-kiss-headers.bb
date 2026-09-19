SUMMARY = "Python package for parsing HTTP/1.1 style headers to objects"
DESCRIPTION = "A Python package for object-oriented HTTP/1.1 style headers. It includes \
a parser and serializer for HTTP headers."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python313-kiss-headers-2.5.0-1.3.noarch.rpm"
RPM_HASH = "b351caef0eeafcf5a3218f3fa8ef39706edd4f2cc843844ed0e7ae6b5b1f77504354e800febac352ada86ca806ab48459d6d8f7f66bf3d652f058b1f1e4b74fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kiss-headers \
python3.13dist-kiss-headers \
python313-kiss-headers \
python3dist-kiss-headers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
