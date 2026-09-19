SUMMARY = "Call chain detection library for coredump images"
DESCRIPTION = "A C programming interface (API) to determine the call chains \
of the threads in coredump images."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "libunwind-coredump0-1.8.3-3.3.aarch64.rpm"
RPM_HASH = "94febc5d9d4862fffeb52efbfe93917150bad6917e40f6df48ce9fb8b6761bd814ae4ce43f343c1156f7f203a28b3a6501615cf18ddca68baac3accc627f2969"

RPROVIDES:${PN} += "libunwind-coredump.so.0 \
libunwind-coredump0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libunwind-aarch64.so.8"

inherit rpm
