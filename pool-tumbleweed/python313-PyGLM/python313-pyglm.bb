SUMMARY = "OpenGL Mathematics library for Python"
DESCRIPTION = "PyGLM is an OpenGL Mathematics library for Python. It mostly compatible with \
GLM and offers a variety of features for vector and matrix manipulation."
LICENSE = "MIT & Zlib"

PV = "2.7.1"

RPM_NAME = "python313-PyGLM-2.7.1-2.7.aarch64.rpm"
RPM_HASH = "bd6b4dae4c0c6ce41c5103359d27e8e433fc5a2b3657c927b3d751b57d55b8cbe1a29a59a5086e3c09543f4f2e62e86b28e3251dc7f971b45dc4870a2dbb708b"

RPROVIDES:${PN} += "python3-PyGLM \
python3.13dist-pyglm \
python313-PyGLM \
python3dist-pyglm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
