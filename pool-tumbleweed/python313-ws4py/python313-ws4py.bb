SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python313-ws4py-0.6.0-2.5.noarch.rpm"
RPM_HASH = "80121440ee26fd43b13513b70fd688ff5b1978605ed022252f255686e1b01f89e535a04266096b05b6e3d75d430ec8aace41ce1db96a3aca61eae239032e2c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ws4py \
python3.13dist-ws4py \
python313-ws4py \
python3dist-ws4py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
