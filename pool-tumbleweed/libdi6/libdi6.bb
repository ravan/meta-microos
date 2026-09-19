SUMMARY = "Disk Information Utility share library"
DESCRIPTION = "di (libdi) is a disk information utility library."
LICENSE = "Zlib"

PV = "6.2.2.2"

RPM_NAME = "libdi6-6.2.2.2-1.4.aarch64.rpm"
RPM_HASH = "e1788af453919717d7f16846c76ada1d72c59421dd490315bfaa6e456bc5076b9082e460a0a18b187505afba0df537347438c5333a3a5a0a2102fadd0bdcff5a"

RPROVIDES:${PN} += "libdi.so.6 \
libdi6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
