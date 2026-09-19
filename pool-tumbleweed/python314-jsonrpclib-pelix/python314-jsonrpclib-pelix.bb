SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python314-jsonrpclib-pelix-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6092c9e5ee598ce65bfaf1134e96b7d03f2fedd2ab1afd8fb2d7eed7bc9b470a85b55edd2adde137270ac1fa0d8ed6ee36bb9d3b99cf3b97ac5074fcb2c56f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonrpclib-pelix \
python314-jsonrpclib-pelix \
python3dist-jsonrpclib-pelix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
