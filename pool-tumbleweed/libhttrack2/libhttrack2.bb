SUMMARY = "Shared library for httrack"
DESCRIPTION = "This package contains the httrack shared libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "libhttrack2-3.49.2-3.11.aarch64.rpm"
RPM_HASH = "5b8266bfec819dcfa35de87b3631e3e54716d3d194184c49f4dbec0219898ce5e185583404f2c1e7a5eb2c2be7008564287c51d124785aec5555f7082e19572d"

RPROVIDES:${PN} += "libbaselinks.so.1 \
libchangecontent.so.1 \
libcontentfilter.so.1 \
libdisplayheader.so.1 \
libfilename.so.1 \
libfilename2.so.1 \
libfilenameiisbug.so.1 \
libhtsjava.so.2 \
libhttrack.so.2 \
libhttrack2 \
liblistlinks.so.1 \
liblog.so.1 \
libsimple.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
