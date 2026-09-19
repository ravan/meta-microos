SUMMARY = "Communication library used by PMI-X"
DESCRIPTION = "This package contains the communication library used by the PMI"
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "libmca_common_dstore1-3.2.5-2.10.aarch64.rpm"
RPM_HASH = "2de5661e5c5ce260b4886fd710a7e488a5502481f29d92e42fc89a46ca7fa0d3aa71a8f99bac1a047fa60adb5bde5514fd9383bf86dd9b91be421f6d6569fcc0"

RPROVIDES:${PN} += "libmca-common-dstore.so.1 \
libmca-common-dstore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
