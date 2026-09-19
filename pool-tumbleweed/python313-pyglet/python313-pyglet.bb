SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.10"

RPM_NAME = "python313-pyglet-2.0.10-1.11.noarch.rpm"
RPM_HASH = "f8c9b8660b665de703a74fb36688072013bc9268de512aafa25b10cc91a151de372d9e197de56e1a2a0799ea003f95bc4da9b8dec196ff6cd741863799d2c10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyglet \
python3.13dist-pyglet \
python313-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python313-Pillow \
python313-pypng"

inherit rpm
