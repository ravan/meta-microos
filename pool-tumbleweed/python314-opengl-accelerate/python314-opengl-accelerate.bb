SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "python314-opengl-accelerate-3.1.10-1.6.aarch64.rpm"
RPM_HASH = "06d1bf1a258d9cd51c7783eaf07c7bdec34c63c74926d60f6c20ac9450d264739bb3941f14cd866ce1e1a15548f5917a46995ede3d50b1ef2681a9015892ebe4"

RPROVIDES:${PN} += "python3.14dist-pyopengl-accelerate \
python314-PyOpenGL-accelerate \
python314-opengl-accelerate \
python3dist-pyopengl-accelerate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-opengl"

inherit rpm
