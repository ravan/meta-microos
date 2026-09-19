SUMMARY = "Base library for ILM software (OpenEXR)"
DESCRIPTION = "Devel files for Imath, which is the base library for OpenEXR."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.2.3"

RPM_NAME = "Imath-devel-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "54a9a870b9f76dca87dcade6b50b42f41b3838ac8bb99c49db4407ba1a5f1c2fe9b0eb48c3a4e3bc041ef6e945a8d880ec63c1ee351e7561240ecd1f7b18328a"

RPROVIDES:${PN} += "Imath-devel \
cmake-Imath \
pkgconfig-Imath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libImath-3-2-30 \
libstdc++-devel"

inherit rpm
