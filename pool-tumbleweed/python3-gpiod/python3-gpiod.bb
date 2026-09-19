SUMMARY = "Python binding for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "python3-gpiod-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "ae68b06259c1073d212c74fb6dac765857f12887557afec583aede5c45e9fcdf10256856844e2e31c5116bc7c4f162cf7b507c180e79dc37da4f402f84c594ab"

RPROVIDES:${PN} += "python-libgpiod \
python3-gpiod \
python3.13dist-gpiod \
python3dist-gpiod"

RDEPENDS:${PN} += "libc.so.6 \
libgpiod.so.3 \
python-abi"

inherit rpm
