SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "dd159ef8b89b72c23ea47d7f38a477cd80db9159bf5f61a6c3887461365738a4847381310e6d31224562cc72def72dfd0be86bb08597569dc846b55cdcf5c203"

RPROVIDES:${PN} += "cross-mips-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
