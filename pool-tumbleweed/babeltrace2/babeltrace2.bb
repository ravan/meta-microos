SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.1.0"

RPM_NAME = "babeltrace2-2.1.0-2.7.aarch64.rpm"
RPM_HASH = "e4398b4af6621c1a570fb8c8ed94d43f3a7212407ab8ae2cf70aa6057eb2afb558c46edd5390d4b226acd232fe903b560835b6042e94868b9554ef7014fa7c8b"

RPROVIDES:${PN} += "babeltrace2 \
libbabeltrace2-ctf-writer.so.0 \
libbabeltrace2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
