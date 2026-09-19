SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python313-hpack-4.2.0-1.1.noarch.rpm"
RPM_HASH = "b8abed20587dfa657dc8c55e9076e134377523ecedb7b9014c28ad2d1043e311d9a033f8b19891098422701e403f51f0853a0f5e98f089e73db2f0f1e53bfe49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hpack \
python3.13dist-hpack \
python313-hpack \
python3dist-hpack"

RDEPENDS:${PN} += "python-abi"

inherit rpm
