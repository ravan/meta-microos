SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python314-sge-pygame-1.7.1-2.5.noarch.rpm"
RPM_HASH = "e0a16c2702da16fff1a704a79f58cac66a26d07229bc45c9eef5325c6177f9033abf37b98f93849e1ce51925e9c1c62c1ac030bd31430245f75ce0a4ac60b5be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sge \
python314-sge-pygame \
python3dist-sge"

RDEPENDS:${PN} += "python-abi \
python314-pygame \
python314-six \
python314-uniseg"

inherit rpm
