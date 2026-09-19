SUMMARY = "FireWire 1394 support for audio devices"
DESCRIPTION = " \
 \
 \
 \
 \
 \
 \
 \
 \
ffado-mixer presents a graphical application allowing a FFADO device \
to be controlled. The extent of the control is determined by the \
level of support for the device in FFADO and in ffado-dbus-server. \
Typical controls offered by ffado-mixer include faders for the \
on-board mixer, phantom power control, mode switches and so on."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ffado-mixer-2.4.9-4.5.noarch.rpm"
RPM_HASH = "2fbe498fef43ca5351f222a41e6a5cb5ca1bfa5fc5d5a95c3c06b272f177b9fdf89eb9c253883c126dd73745a00444852ae1e33476b920eb020e3bde999419e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ffado-mixer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ffado \
python-abi"

inherit rpm
