SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "Apache-2.0"

PV = "3.0.15"

RPM_NAME = "libmodsecurity3-3.0.15-2.3.aarch64.rpm"
RPM_HASH = "b3e3bb80cde5dc207130bbd79c3da31bd0021e5934cf7c311c164a5cd5273ffbcd241bbdba3b194a1906453ca45da87d9ae194f3036c3d9ee6bbd085c3fc1684"

RPROVIDES:${PN} += "libmodsecurity.so.3 \
libmodsecurity3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfuzzy.so.2 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libmaxminddb.so.0 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libyajl.so.2"

inherit rpm
