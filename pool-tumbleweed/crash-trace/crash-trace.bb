SUMMARY = "The trace command for crash"
DESCRIPTION = "This extension implements the 'trace' command for the crash tool."
LICENSE = "GPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "crash-trace-3.0-2.10.aarch64.rpm"
RPM_HASH = "6a6a61d500bade421b4df5f240ea94c41ab6b07bc871ec4859f49b8cc2d861592ff23266052716398c5e786bbef286f740c0cd5b23ad97c1ffe3cb902be12dbb"

RPROVIDES:${PN} += "crash-trace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
trace-cmd"

inherit rpm
