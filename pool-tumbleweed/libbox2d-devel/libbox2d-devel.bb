SUMMARY = "A 2D Physics Engine for Games"
DESCRIPTION = "Box2D is an open source C++ engine for simulating rigid bodies in 2D."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libbox2d-devel-2.4.1-3.6.aarch64.rpm"
RPM_HASH = "37b8d8357be66af36b16817954dd0c9dd60c1806055ce9368c916e75798cd21f88c29dcbeccad370146ea83384645126ce001537d2ef1689983cca70ff31b269"

RPROVIDES:${PN} += "cmake-box2d \
libbox2d-devel"

RDEPENDS:${PN} += "libbox2d2"

inherit rpm
