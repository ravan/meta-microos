SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.10"

RPM_NAME = "python314-pyglet-2.0.10-1.11.noarch.rpm"
RPM_HASH = "4b4aa977ccad2e86ef02d9b01f189f870bb87e69850d15de6a3cc61b700252194793b89c5835a41eb6c680ad7bb36ffe8db7e711cc2e1f0afdfa8b5b9e444dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyglet \
python314-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python314-Pillow \
python314-pypng"

inherit rpm
