SUMMARY = "Library for transferring data from URLs"
DESCRIPTION = "The cURL shared library for accessing data using different \
network protocols."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "libcurl-mini4-8.22.0-1.1.aarch64.rpm"
RPM_HASH = "00061f7390994695543b6180f15e9c7924060d6367f558969cb5d0c251b0f2920a1a3869b549ff1235d9776bca626dd2d72e75b70b7e91c100d53a9db43782b4"

RPROVIDES:${PN} += "libcurl-mini4 \
libcurl.so.4 \
libcurl4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libidn2.so.0 \
libnghttp2.so.14 \
libnghttp3.so.9 \
libngtcp2-crypto-ossl.so.0 \
libngtcp2.so.16 \
libpsl.so.5 \
libssl.so.3 \
libz.so.1 \
libzstd.so.1"

inherit rpm
