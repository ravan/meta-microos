SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python313-h11-0.16.0-1.5.noarch.rpm"
RPM_HASH = "4dd4a9fa92134078d0fcc089708ccc7f424d8a466a603b05b3765748f16749f7b5d1d7d78032437b9eb0cce76cb1106a2665b674ad94c2aa917a2ce25814e4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h11 \
python3.13dist-h11 \
python313-h11 \
python3dist-h11"

RDEPENDS:${PN} += "python-abi"

inherit rpm
