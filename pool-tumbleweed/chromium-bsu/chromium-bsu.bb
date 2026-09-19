SUMMARY = "Vertical Scrolling Space Shooter Game"
DESCRIPTION = "Chromium B.S.U. is a fast paced, arcade-style, top-scrolling space shooter. \
 \
You are captain of the cargo ship Chromium B.S.U., responsible for \
delivering supplies to our troops on the front line. Your ship has \
a small fleet of robotic fighters which you control from the relative \
safety of the Chromium vessel."
LICENSE = "ClArtistic & MIT"

PV = "0.9.16.1"

RPM_NAME = "chromium-bsu-0.9.16.1-3.7.aarch64.rpm"
RPM_HASH = "40b71bb8fb59e7e35144d4829bb2fb144c279fc06d4f52823d15436323d51ca979775333bf87d3e05b6f7c21392126d199d275a5eea214236ed39cb73f4edf91"

RPROVIDES:${PN} += "chromium-bsu \
config-chromium-bsu"

RDEPENDS:${PN} += "group-games \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLC.so.0 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
user-games"

inherit rpm
