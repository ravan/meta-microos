SUMMARY = "Passenger apache module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the apache2 sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.2.0"

RPM_NAME = "rubygem-passenger-apache2-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "8aaaacc414d9314e1e720cdf98c1e5b57fb94d87644f46c92cdbecadf5619a466a4b6ef7a73cd0b66c8c01a3cc2ecfb82f7e92e08333c1aa31daf2c2faacde3d"

RPROVIDES:${PN} += "config-rubygem-passenger-apache2 \
rubygem-passenger-apache2"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
rubygem-passenger"

inherit rpm
