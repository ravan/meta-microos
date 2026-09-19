SUMMARY = "OpenGL Mathematics library for Python"
DESCRIPTION = "PyGLM is an OpenGL Mathematics library for Python. It mostly compatible with \
GLM and offers a variety of features for vector and matrix manipulation."
LICENSE = "MIT & Zlib"

PV = "2.7.1"

RPM_NAME = "python314-PyGLM-2.7.1-2.7.aarch64.rpm"
RPM_HASH = "1bdedd130a7a603166e255c414d145762b3f0d211bee696a0840ba12a1eb685ed92a7a984c6bcf38e215d4c98cd4ec80f40ab674a7f68258c0413b4661f0992f"

RPROVIDES:${PN} += "python3.14dist-pyglm \
python314-PyGLM \
python3dist-pyglm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
