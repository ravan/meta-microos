SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python314-requests-unixsocket-0.4.1-1.2.noarch.rpm"
RPM_HASH = "613e1817b650370d071a139fe892feaa2e2717300ffdc5c94ae2c512fa10aa8719aa17bcd735871ceec0fb47df6b8b8696388efed6815aa48fa55a4f3241b729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-unixsocket \
python314-requests-unixsocket \
python3dist-requests-unixsocket"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
