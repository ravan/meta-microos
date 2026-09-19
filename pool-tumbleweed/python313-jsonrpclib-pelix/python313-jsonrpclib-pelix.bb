SUMMARY = "JSPN-RPC over HTTP Library for Pelix Remote Services"
DESCRIPTION = "A Python (2 & 3) JSON-RPC over HTTP that mirrors xmlrpclib syntax."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python313-jsonrpclib-pelix-1.2.0-1.1.noarch.rpm"
RPM_HASH = "1305ff2a223452f0bdc611d7d666d677c51a624d68a201d36b27a13a3041a2f81b735cb195a2dc7038d44a648ea5aed6549ad9cb95713b538ebedb95cfafba3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonrpclib-pelix \
python3.13dist-jsonrpclib-pelix \
python313-jsonrpclib-pelix \
python3dist-jsonrpclib-pelix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
