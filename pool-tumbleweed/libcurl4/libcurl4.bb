SUMMARY = "Library for transferring data from URLs"
DESCRIPTION = "The cURL shared library for accessing data using different \
network protocols."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "libcurl4-8.22.0-1.1.aarch64.rpm"
RPM_HASH = "38bb1cdf55ab6629e12fb3ca298bdbf875efafcc70bcdbb3225bdc9db4b0708f78f4fbdba87dff98a19cb29e266819196e7305811b073661aab0016e345a8d9c"

RPROVIDES:${PN} += "libcurl.so.4 \
libcurl4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
liblber.so.2 \
libldap.so.2 \
libnghttp2.so.14 \
libnghttp3.so.9 \
libngtcp2-crypto-ossl.so.0 \
libngtcp2.so.16 \
libpsl.so.5 \
libssh.so.4 \
libssl.so.3 \
libz.so.1 \
libzstd.so.1"

inherit rpm
