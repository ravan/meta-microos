SUMMARY = "Development headers for quickjs"
DESCRIPTION = "Development headers for quickjs"
LICENSE = "MIT"

PV = "20260604"

RPM_NAME = "quickjs-devel-20260604-2.3.aarch64.rpm"
RPM_HASH = "ef16464c3e5242dbaa724ce2c019ed7dbb3545bba3e024f7d564dba2862ea18ea71ab4ab9988edb549e9d7295a2ff920d0e043abe23f853e064f332725287c3a"

RPROVIDES:${PN} += "quickjs-devel"

RDEPENDS:${PN} += ""

inherit rpm
