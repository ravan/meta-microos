SUMMARY = "Header files for development with PackageKit"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "PackageKit-devel-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "f22c60f97b4bbbe83b7cb7e53899b5e475aa09240a31943c7d9502e689424e99ea95ee47139985ce5ad46af1e284dda17449264b158b92dca3a883b8758291a4"

RPROVIDES:${PN} += "PackageKit-devel \
libpk-backend-test-fail.so \
libpk-backend-test-nop.so \
libpk-backend-test-spawn.so \
libpk-backend-test-succeed.so \
libpk-backend-test-thread.so"

RDEPENDS:${PN} += "/usr/bin/env \
PackageKit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekit-glib2-devel \
libpackagekit-glib2.so.18"

inherit rpm
