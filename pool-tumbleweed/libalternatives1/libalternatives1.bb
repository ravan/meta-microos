SUMMARY = "Runtime for libalternatives"
DESCRIPTION = "This package contains the core logic and the runtime library for \
libalternatives. libalternatives is a helper that executes an application based \
on preferences of a user, system admin or package maintainer, in this order of \
preference. This is accomplished with only the help of config files and \
without the need to maintain system symlinks states."
LICENSE = "Apache-2.0"

PV = "2.0+0.4f22c01"

RPM_NAME = "libalternatives1-2.0+0.4f22c01-1.1.aarch64.rpm"
RPM_HASH = "52590596f477a27ceb08a7faed0f0fe28a977c045ca960aa4543f4ea9cab206ef3f99bbcfe6c1c67fb64238cf615ddbd2c7bf1210a69ebea35a755d81a16894e"

RPROVIDES:${PN} += "libalternatives.so.1 \
libalternatives1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
