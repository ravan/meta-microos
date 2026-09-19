SUMMARY = "I3 Status Bar"
DESCRIPTION = "i3status is a program for generating a status bar for i3bar, dzen2, \
xmobar or similar programs. It issues a small number of system \
calls, as one generally wants to update such status lines every \
second so that the bar is updated even under load. It saves a bit of \
energy by being more efficient than shell commands."
LICENSE = "BSD-3-Clause"

PV = "2.15"

RPM_NAME = "i3status-2.15-1.8.aarch64.rpm"
RPM_HASH = "bd9700106cd9f84aadcdd29b2ea58dd4b4eaa16c30d0a7208cbb82fbdd0ff000f64f67ea46b5174afa67770936967b373f2a2aa5d7b07fd91ea6f02af2691ed8"

RPROVIDES:${PN} += "config-i3status \
i3status"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libconfuse.so.2 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpulse.so.0 \
libyajl.so.2"

inherit rpm
