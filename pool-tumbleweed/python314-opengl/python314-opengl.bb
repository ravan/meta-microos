SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "python314-opengl-3.1.10-1.4.noarch.rpm"
RPM_HASH = "0e8f28d01915b42b5d11711b1f51cdc2081767a8d210855bb3f5c4643bad3cb4d583372fe95a52c47cc55fcd82ac616356d16589164660a02c8be45da35ca368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyopengl \
python314-PyOpenGL \
python314-opengl \
python314-pyopengl \
python3dist-pyopengl"

RDEPENDS:${PN} += "Mesa-dri \
python-abi"

inherit rpm
