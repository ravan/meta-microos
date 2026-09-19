SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "babeltrace-1.5.8-4.9.aarch64.rpm"
RPM_HASH = "d8332f36587a37132919f366c2be78e73252381f2a5c7597ba0adc46dc832a3a73b211fe4f9fab1c3fb8f6d5cf06f528fe3f04f2a687941d94fc087552bdc873"

RPROVIDES:${PN} += "babeltrace \
libbabeltrace-ctf-metadata.so.1 \
libbabeltrace-ctf-text.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace-dummy.so.1 \
libbabeltrace-lttng-live.so.1 \
libbabeltrace.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libpopt.so.0 \
libuuid.so.1"

inherit rpm
