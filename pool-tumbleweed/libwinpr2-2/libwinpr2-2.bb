SUMMARY = "Windows Portable Runtime"
DESCRIPTION = "WinPR provides API compatibility for applications targeting non-Windows \
environments. When on Windows, the original native API is being used instead of \
the equivalent WinPR implementation, without having to modify the code using it."
LICENSE = "Apache-2.0"

PV = "2.11.7"

RPM_NAME = "libwinpr2-2-2.11.7-8.4.aarch64.rpm"
RPM_HASH = "3d8fb421d7fbd80cef502bfb533b0fb5ed1084bc481591bab53f9399e0d7778210cec8f8e7dd55d7b0e45de8843652443050297eb4fb310cca1d84e251c4d52c"

RPROVIDES:${PN} += "libwinpr-tools2.so.2 \
libwinpr2 \
libwinpr2-2 \
libwinpr2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libicuuc.so.78 \
libm.so.6 \
libssl.so.3 \
libsystemd.so.0"

inherit rpm
