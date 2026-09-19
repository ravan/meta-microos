SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "If you plan to develop tests for a PAM module, you can use this library, \
which simplifies testing of modules. This subpackage includes the header \
files for libpamtest"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "libpamtest-devel-1.1.8-1.4.aarch64.rpm"
RPM_HASH = "c2fdd7ea7fa39b33b6a975f80cf6d358220df22198c6acb3c6cba3ae99cee4544c97ea00a5a44808889a50dd454b8268c7b669609ee2411a275c8cbd162d7bf3"

RPROVIDES:${PN} += "cmake-pamtest \
libpamtest-devel \
pkgconfig-libpamtest"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpamtest0 \
pam-wrapper"

inherit rpm
