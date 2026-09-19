SUMMARY = "Compositor for the COSMIC DE"
DESCRIPTION = "Compositor for the COSMIC DE."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-comp-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "c271d445e36b686ba17f25366e0d7c0544c5e679adf9c95945a15351e726e00422f33530ff9a0c2ca13688eb13c43cc4fcd9cfba6744b593ee48bfa1a20933b5"

RPROVIDES:${PN} += "cosmic-comp"

RDEPENDS:${PN} += "Mesa-libEGL1 \
libc.so.6 \
libdisplay-info.so.3 \
libgbm.so.1 \
libgcc-s.so.1 \
libinput.so.10 \
libm.so.6 \
libpixman-1.so.0 \
libseat.so.1 \
libudev.so.1 \
libxkbcommon.so.0"

inherit rpm
