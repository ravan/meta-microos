SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.10"

RPM_NAME = "python311-pyglet-2.0.10-1.7.noarch.rpm"
RPM_HASH = "0b0e61f411a76a4453182d553ca75007da1df3b8210d67ee5149a4507466c3037a0d202434482b0d57cbe72b4c902e56cc3ffc115c4cf18bae9aac872f82630a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyglet \
python311-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python311-Pillow \
python311-pypng"

inherit rpm
