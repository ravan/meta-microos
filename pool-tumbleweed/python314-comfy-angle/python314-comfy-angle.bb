SUMMARY = "Mesa/libglvnd backend for ComfyUI's comfy-angle API"
DESCRIPTION = "Distro implementation of the comfy-angle 0.1.1 Python API used by \
ComfyUI's GLSL Shader node. The module locates the system's libEGL \
and libGLESv2 (libglvnd dispatch plus Mesa) at runtime. It does not \
ship Chromium ANGLE binaries; headless rendering comes from Mesa's \
surfaceless EGL platform."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-comfy-angle-0.1.1-1.1.noarch.rpm"
RPM_HASH = "30a7e2d5fb2a30c357ab222a6e2708f2297dd08f7d78479d87e874a9d13638dc1d828bfe2e406805290799d8a2e4bf6ed26909fde441f6cd84f2010bc0e38a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfy-angle \
python314-comfy-angle \
python3dist-comfy-angle"

RDEPENDS:${PN} += "Mesa-dri \
Mesa-libEGL1 \
libglvnd \
python-abi"

inherit rpm
