SUMMARY = "Utility for listing and reaping zombie processes"
DESCRIPTION = "zps aims to list the running processes at a particular time with stats and indicate \
the zombie processes on this list. It can also reap these zombie processes automatically \
if `--reap` argument is provided. There's also `--lreap` argument for reaping zombie \
processes after listing."
LICENSE = "GPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "zps-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "54f582779b74a1e323bfa5ead0176b54a350ccf84800698287ffddef2d022a1935df6692131be32adb19baa2b579ba1778f1f44b63ecff7276150952353a0880"

RPROVIDES:${PN} += "zps"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
