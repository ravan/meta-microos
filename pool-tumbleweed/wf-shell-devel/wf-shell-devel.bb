SUMMARY = "Development files for wf-shell"
DESCRIPTION = "Development libraries for wf-shell"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wf-shell-devel-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "a38dd9b5a61dc647b175a3a397e1a1a6d03a73b71c046abad8a4f4f996e32611d546d0b5f118bad606b59b8ea0ab62a2eb2553a1d04740881823ec25a7a7b05b"

RPROVIDES:${PN} += "pkgconfig-wf-shell \
wf-shell-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
wf-shell"

inherit rpm
