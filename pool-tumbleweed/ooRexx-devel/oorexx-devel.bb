SUMMARY = "Open Object REXX development files"
DESCRIPTION = "Development files for Open Object Rexx. These are intended for developing REXX extensions only."
LICENSE = "CPL-1.0"

PV = "5.2.0"

RPM_NAME = "ooRexx-devel-5.2.0-2.1.noarch.rpm"
RPM_HASH = "52ff8cbf7b6bf90e555b8ba408145990b7e9e6a0da17475f9e3aecfd2e2b5272af9878b0c8ecb1f3b9b9ef4085d1f1a910153d80d39a04bf121886e2e7db5788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ooRexx-devel \
ooRexx-devel \
pkgconfig-ooRexx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/rexx"

inherit rpm
