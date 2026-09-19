SUMMARY = "Documents and examples for systemtap"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the documents and examples for systemtap."
LICENSE = "GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "systemtap-docs-5.5-1.2.noarch.rpm"
RPM_HASH = "0bb161a55456e2b1c98b9f2a3e1c728dae8faf935648c9f148dd1c2bf91e6a07a504a4d1909ea77b8f79e831fbe53e8a8a8e59bab8e6c722e7d7de7de147b6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemtap-docs"

RDEPENDS:${PN} += ""

inherit rpm
