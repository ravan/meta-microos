SUMMARY = "Windows Portable Runtime"
DESCRIPTION = "WinPR provides API compatibility for applications targeting non-Windows \
environments. When on Windows, the original native API is being used instead of \
the equivalent WinPR implementation, without having to modify the code using it."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "libwinpr3-3-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "dda833b07933b0b305f92db36fa0eed4e70b85c8bee05a5449eb1deb53d1bbb5ddbcc6d6dc6e0d8345b84aba413f91e9302cb07f6279e93e2554b1509f91c933"

RPROVIDES:${PN} += "libwinpr-tools3.so.3 \
libwinpr3-3 \
libwinpr3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libicuuc.so.78 \
libk5crypto.so.3 \
libkrb5.so.3 \
libssl.so.3 \
liburiparser.so.1"

inherit rpm
