SUMMARY = "Display and control your Android device"
DESCRIPTION = "This application mirrors Android devices (video and audio) connected \
via USB or TCP/IP and allows control using the computer's keyboard and \
mouse. It does not require root access or an app installed on the device. \
 \
Use /usr/bin/scrcpy-update-server (root/sudo) to download/update \
the required pre-build /usr/share/scrcpy/scrcpy-server binary."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "scrcpy-4.1-1.1.aarch64.rpm"
RPM_HASH = "a24789b169929e50ba111df0fabfbe2195f87aec51528007d511e8038f64a3515754dbdac9dc2db180930191dc41692806f4c029f3d39d771508309e0f123722"

RPROVIDES:${PN} += "scrcpy \
scrcpy-bash-completion \
scrcpy-zsh-completion"

RDEPENDS:${PN} += "/usr/bin/sh \
android-tools \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libswresample.so.6 \
libusb-1.0.so.0"

inherit rpm
