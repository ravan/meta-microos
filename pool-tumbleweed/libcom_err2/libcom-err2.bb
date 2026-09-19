SUMMARY = "E2fsprogs error reporting library"
DESCRIPTION = "com_err is an error message display library."
LICENSE = "MIT"

PV = "1.47.3"

RPM_NAME = "libcom_err2-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "f1ab3214634eebef7a3ecf867044f624b7a09f2847d09e0205d9ce7b979079d0218c516128578f6968efe2e0730f060a8e93977fd146e5b21cf573fddfea2286"

RPROVIDES:${PN} += "libcom-err \
libcom-err.so.2 \
libcom-err2 \
libss.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
