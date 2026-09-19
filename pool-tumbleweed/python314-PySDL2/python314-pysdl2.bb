SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.17"

RPM_NAME = "python314-PySDL2-0.9.17-3.4.noarch.rpm"
RPM_HASH = "549dc21ae42a526c76d657c4f635215b3a49635c9b5fcb88092c76256a7c0457f0ab878aef1e0127900107b0e65d6bc5a201a8eb0b87aed04d5479989da22477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysdl2 \
python314-PySDL2 \
python3dist-pysdl2"

RDEPENDS:${PN} += "libSDL2-2-0-0 \
libSDL2-gfx-1-0-0 \
libSDL2-image-2-0-0 \
libSDL2-mixer-2-0-0 \
libSDL2-ttf-2-0-0 \
python-abi"

inherit rpm
