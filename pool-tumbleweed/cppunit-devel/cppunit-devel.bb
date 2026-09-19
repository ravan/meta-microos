SUMMARY = "Include Files and Libraries for cppunit"
DESCRIPTION = "Cppunit library, headers, and all relevant additions for writting C++ unittests \
in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "cppunit-devel-1.15.1-1.26.aarch64.rpm"
RPM_HASH = "ddd3bcba7afd0fc74ae245c2ceb568c4d1efccd23594e256ae6b0179a23c1a7b4ea5b086d7e2e421104a28614181187afc7b4e7844c231fdb2832f93927fd7ad"

RPROVIDES:${PN} += "cppunit-devel \
libcppunit-devel \
pkgconfig-cppunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcppunit-1-15-1 \
libcppunit-1.15.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
