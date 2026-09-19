SUMMARY = "Linux kernel trace event library"
DESCRIPTION = "The libtraceevent library provides APIs to access kernel tracepoint events located in the tracefs file system under the events directory."
LICENSE = "GPL-2.0-only"

PV = "1.9.0"

RPM_NAME = "libtraceevent1-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "9a59a9202d4c511e963b523975c865c658a74527545ffd32965058cbf8e88da98c58eab21b5637fd9c58681e464473c72010166f5fd8315e2efbd481266f993a"

RPROVIDES:${PN} += "libtraceevent.so.1 \
libtraceevent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
