SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python314-requests-wsgi-adapter-0.4.1-3.5.noarch.rpm"
RPM_HASH = "85683ccefee4d84c2bc3d99e95414b94ec826f423bebd594284cf2200b030af30aa0bf504f0f008e4fa1591de78c8a37a0747519062c665405da03353d5f5058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-wsgi-adapter \
python314-requests-wsgi-adapter \
python3dist-requests-wsgi-adapter"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
