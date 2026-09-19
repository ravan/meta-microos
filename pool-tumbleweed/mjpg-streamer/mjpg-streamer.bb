SUMMARY = "Program for streaming webcam video to HTTP"
DESCRIPTION = "MJPG-streamer takes JPGs from Linux-UVC compatible webcams, from \
local files or other input plugins and streams them as M-JPEG via \
HTTP to webbrowsers, VLC and other software. It is the successor of \
uvc-streamer, a Linux-UVC streaming application with Pan/Tilt. \
 \
This package provides a fork including support for Raspberry Pi Camera. \
 \
Enable the service by specifing the video device via \
 \
 \
 \
The number reflects /dev/videoX and listening port 808X."
LICENSE = "GPL-2.0-only"

PV = "1.0.0"

RPM_NAME = "mjpg-streamer-1.0.0-4.4.aarch64.rpm"
RPM_HASH = "e48b4a11b2bf211eaf0eb570559e4254566f68ec84262e128ccc70dccacae18141ea97782aef54776827faf50eca96ccbea61e23e1e4054640ee786d5cb4f3e2"

RPROVIDES:${PN} += "mjpg-streamer"

RDEPENDS:${PN} += "/usr/bin/sh \
libSDL-1.2.so.0 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libjpeg.so.8 \
libprotobuf-c.so.1 \
libzmq.so.5"

inherit rpm
