SUMMARY = "Video4linux video driver for the Xorg X server"
DESCRIPTION = "v4l is an Xorg driver for video4linux video cards. \
 \
It provides a Xvideo extension port for video overlay. Just add the \
driver to the module list within the module section of your \
configuration file if you want to use it. There are no config options."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "xf86-video-v4l-0.3.0-1.31.aarch64.rpm"
RPM_HASH = "98813dad492bfd207564ed5cde2bd0c381b2ddecc256cab890a0f0fd35654dcaa1fca5fca0aceeda2dd25c223884b0f707ff715e8c93864c92b7c4acec16ade2"

RPROVIDES:${PN} += "xf86-video-v4l"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
