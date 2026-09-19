SUMMARY = "Tool for setting the special features of some Logitech mice"
DESCRIPTION = "lomoco can configure vendor-specific options on Logitech USB mice (or \
dual-personality mice plugged into the USB port). A number of recent \
devices are supported. The program is mostly useful in setting the \
resolution to 800 cpi on mice that boot at 400 cpi (such as the \
MX-500), and disabling SmartScroll or Cruise Control for those who \
would rather use the two extra buttons as ordinary mouse buttons. \
 \
You can configure which features should be enabled in \
/etc/sysconfig/logitech_mouse"
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "lomoco-1.0-128.9.aarch64.rpm"
RPM_HASH = "bc8c3c77577504395d29bd0ed53712f3ad17269351648524198d7ff7eb5cacc7d117b6f614c06576bdbbcad237987e3b0322e9d6edda140bf741bbca938950e3"

RPROVIDES:${PN} += "lmctl-/usr/bin/lmctl \
lomoco"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
