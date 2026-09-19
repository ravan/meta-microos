SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "python313-opengl-3.1.10-1.4.noarch.rpm"
RPM_HASH = "e5ed9c68aa58201b72ef4b8b1431fbe0ee544210561cf63927ad5840c6050e10907a5191b80648d66c420e791fafd87fe4b4d61449310131898a1adf8763ac2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOpenGL \
python3-opengl \
python3-pyopengl \
python3.13dist-pyopengl \
python313-PyOpenGL \
python313-opengl \
python313-pyopengl \
python3dist-pyopengl"

RDEPENDS:${PN} += "Mesa-dri \
python-abi"

inherit rpm
