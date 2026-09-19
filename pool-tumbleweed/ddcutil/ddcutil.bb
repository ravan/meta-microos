SUMMARY = "Utility to query and update monitor settings"
DESCRIPTION = "ddcutil communicates with monitors implementing MCCS (Monitor Control Command \
Set), using either the DDC/CI protocol on the I2C bus or as a Human Interface \
Device on USB. \
 \
A particular use case for ddcutil is as part of color profile management. \
Monitor calibration is relative to the monitor color settings currently in \
effect, e.g. red gain.  ddcutil allows color related settings to be saved at \
the time a monitor is calibrated, and then restored when the calibration is \
applied."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "ddcutil-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "65f355a746f615bafa34a453eafceeabbb8c292dde6d5bdc44501c9fc543c810b64ff6c4ac33aa5fc0e0a621300abe83fb30a08db87376847e4f1bb4e8a6ed92"

RPROVIDES:${PN} += "ddcutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libacl.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdrm.so.2 \
libglib-2.0.so.0 \
libjansson.so.4 \
libudev.so.1"

inherit rpm
