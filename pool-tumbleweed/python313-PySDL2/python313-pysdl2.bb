SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.17"

RPM_NAME = "python313-PySDL2-0.9.17-3.4.noarch.rpm"
RPM_HASH = "3c4a7be374e726d2abb6267add7ec7676355eacb572d42d81c8ff35ffe7a4d4ca9cabcf595d3704270c9bd0355bf3692bf57b70b6e7df635af4b91ffeede9601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySDL2 \
python3.13dist-pysdl2 \
python313-PySDL2 \
python3dist-pysdl2"

RDEPENDS:${PN} += "libSDL2-2-0-0 \
libSDL2-gfx-1-0-0 \
libSDL2-image-2-0-0 \
libSDL2-mixer-2-0-0 \
libSDL2-ttf-2-0-0 \
python-abi"

inherit rpm
