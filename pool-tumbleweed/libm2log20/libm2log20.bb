SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "15.3.0+git11272"

RPM_NAME = "libm2log20-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "b1d672097bc9297e909795a0a17bff35444d1227a31b9b58ceeaafc61fadd4e6a741ca28f219c6f29980db21240d14578642cf951268f45ad6c38a6057046714"

RPROVIDES:${PN} += "libm2log.so.20 \
libm2log20"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
