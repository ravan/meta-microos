SUMMARY = "Library for asynchronous name resolves"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides the shared libraries for c-ares."
LICENSE = "MIT"

PV = "1.34.8"

RPM_NAME = "libcares2-1.34.8-1.1.aarch64.rpm"
RPM_HASH = "2a9bf5c1883d92118c7ac471c9054ba2713145334ddd6d333a91a801983ef481874f31e3705dc8dee7da45cb608d8e450b36509fe4a761d41baef099080b91ab"

RPROVIDES:${PN} += "libcares.so.2 \
libcares2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
netcfg"

inherit rpm
