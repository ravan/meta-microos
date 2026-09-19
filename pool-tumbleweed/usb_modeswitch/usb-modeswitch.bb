SUMMARY = "A mode switching tool for controlling multiple-device USB gear"
DESCRIPTION = "USB_ModeSwitch is a mode switching tool for controlling 'flip flop' \
(multiple device) USB gear. It allows so-called 'Zero-CD' devices that \
show up as USB storage initially to be switched into their more useful \
'application mode'. This is most common for UMTS/3G wireless WAN \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "usb_modeswitch-2.6.1-4.5.aarch64.rpm"
RPM_HASH = "db90e2260cc19b3968eec5ea09abffea17383182c1bf95159452b13412e0ea944935fb3d2ae492bc5c412171a08ebc3367497730be0594603c6dd44dd5095d4f"

RPROVIDES:${PN} += "config-usb-modeswitch \
usb-modeswitch"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/tclsh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
systemd \
tcl \
usb-modeswitch-data"

inherit rpm
