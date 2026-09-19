SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "python313-opengl-accelerate-3.1.10-1.6.aarch64.rpm"
RPM_HASH = "00471744716c909e3d0aaf69b17f99b84725b1957915d908a39933b2bbfbfa67ba6b1ed3e301ef5bc8f6f132a5ba7c87fd01bd13c581a431f0c59f417eadf609"

RPROVIDES:${PN} += "python3-PyOpenGL-accelerate \
python3-opengl-accelerate \
python3.13dist-pyopengl-accelerate \
python313-PyOpenGL-accelerate \
python313-opengl-accelerate \
python3dist-pyopengl-accelerate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-opengl"

inherit rpm
