SUMMARY = "A wrapper script for running a webcam based on gphoto2"
DESCRIPTION = "This package contains a gphoto2-webcam script that feeds gphoto2 previews \
into a virtual video4linux2 loopback device. \
 \
You need to run as root: \
 \
	modprobe v4l2loopback exclusive_caps=1 card_label='GPhoto2 Webcam'"
LICENSE = "GPL-2.0-or-later"

PV = "1"

RPM_NAME = "gphoto2-webcam-1-1.34.aarch64.rpm"
RPM_HASH = "5fea35c23485297bdea2cde3a611726716af49f71bd6fff50491072776c241998e74a3015655b470b629164cc32d7e3dd2138151cfc1ee5cf8b246a890da9275"

RPROVIDES:${PN} += "gphoto2-webcam"

RDEPENDS:${PN} += "/usr/bin/bash \
ffmpeg \
gphoto \
kmod-v4l2loopback.ko \
v4l-utils"

inherit rpm
