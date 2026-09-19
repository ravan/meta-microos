SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python314-hpack-4.2.0-1.1.noarch.rpm"
RPM_HASH = "8482db7f8cc847b441108e46b16ae9e83e9396fae11f32194551bcd4f1ebca18d8a09af43f7ceb269b0a226880bc72608c0740cc6697dd870a3b83d3d4c14052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hpack \
python314-hpack \
python3dist-hpack"

RDEPENDS:${PN} += "python-abi"

inherit rpm
