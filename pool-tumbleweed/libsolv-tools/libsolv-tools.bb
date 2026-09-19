SUMMARY = "Utilities to work with .solv files"
DESCRIPTION = "libsolv is a library for solving packages and reading repositories. \
 \
This subpackage contains utilities to create and work with the .solv \
files used by libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "libsolv-tools-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "f10b6b7fd69243ed18c8107136e281743f925a494e8df76b0c9133bcb9de53ba46deeab44da17a935b383815f3eecd4605b0f17dc43cdd0504023d3543ceac06"

RPROVIDES:${PN} += "libsolv-tools \
satsolver-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libsolv-tools-base \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
