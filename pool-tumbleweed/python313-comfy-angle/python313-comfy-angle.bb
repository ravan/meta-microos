SUMMARY = "Mesa/libglvnd backend for ComfyUI's comfy-angle API"
DESCRIPTION = "Distro implementation of the comfy-angle 0.1.1 Python API used by \
ComfyUI's GLSL Shader node. The module locates the system's libEGL \
and libGLESv2 (libglvnd dispatch plus Mesa) at runtime. It does not \
ship Chromium ANGLE binaries; headless rendering comes from Mesa's \
surfaceless EGL platform."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-comfy-angle-0.1.1-1.1.noarch.rpm"
RPM_HASH = "873f61a4e8e4c7954fad31abdabc1f5187841417c078d698257621aad0712f055f9f3a264260d021178766a1e820c1b3d3ba73d00f9244de2aab6e8c34684ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfy-angle \
python3.13dist-comfy-angle \
python313-comfy-angle \
python3dist-comfy-angle"

RDEPENDS:${PN} += "Mesa-dri \
Mesa-libEGL1 \
libglvnd \
python-abi"

inherit rpm
