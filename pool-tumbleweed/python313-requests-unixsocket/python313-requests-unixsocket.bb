SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python313-requests-unixsocket-0.4.1-1.2.noarch.rpm"
RPM_HASH = "5ed5359980bd309c745d4ab38d0bdc90354b0ef2b94d31dc9520aaa46042250f00f7ac9cbc07ffcbd1e163fd51de89e812f510436d517216e6f849cbc80d43e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-unixsocket \
python3.13dist-requests-unixsocket \
python313-requests-unixsocket \
python3dist-requests-unixsocket"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
