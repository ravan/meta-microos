SUMMARY = "Data caching daemon for RRDtool"
DESCRIPTION = "rrdcached is a daemon that receives updates to existing RRD files, \
accumulates them and, if enough have been received or a defined time has \
passed, writes the updates to the RRD file.  The daemon was written with \
big setups in mind which usually runs into I/O related problems.  This \
daemon was written to alleviate these problems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "rrdtool-cached-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "868368bd1d795779330d068370b2c86210b5fd4c73624ca1abd807717c77d128e5c7054f7dc50e6fd7e2c0ecb6019ac35ed759f77a1f5ec27dbf778d3c1fc00d"

RPROVIDES:${PN} += "group-rrdcached \
rrdtool-cached \
user-rrdcached"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
librrd.so.8 \
libwrap.so.0 \
rrdtool \
shadow"

inherit rpm
