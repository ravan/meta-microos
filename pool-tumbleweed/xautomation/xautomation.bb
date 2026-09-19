SUMMARY = "Control X from the command line for scripts"
DESCRIPTION = "Control X from the command line for scripts, and do 'visual scraping' to find \
things on the screen. The conrol interface allows mouse movement, clicking, \
button up/down, key up/down, etc, and uses the XTest extension so you don't \
have the annoying problems that xse has when apps ignore sent events. The \
visgrep program find images inside of images and reports the coordinates, \
allowing programs to find buttons, etc, on the screen to click on."
LICENSE = "GPL-2.0+"

PV = "1.09"

RPM_NAME = "xautomation-1.09-1.41.aarch64.rpm"
RPM_HASH = "9fd26792a41afcafd2421597df473b9837e0ecbfa63472726996ce3654832adb95b274602f4417aeee03c0c8388e9612bf18cb7c49b3b09b8d1e65a1e4d8511a"

RPROVIDES:${PN} += "xautomation"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libpng16.so.16"

inherit rpm
