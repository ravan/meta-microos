SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "26.6.1"

RPM_NAME = "python313-txaio-26.6.1-1.1.noarch.rpm"
RPM_HASH = "9a77b427691078ae3f929085e464efc76986d2f750da956f29dee7eba2637b03f1561690d1dcc38850c825085f09de685b72a70f019521f9754110857c86e91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txaio \
python3.13dist-txaio \
python313-txaio \
python3dist-txaio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
