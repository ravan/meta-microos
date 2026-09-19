SUMMARY = "Osmocom E1 Daemon"
DESCRIPTION = "osmo-e1d is an E1 interface daemon that is part of the Osmocom E1 \
interface driver architecture. It was primarily written for the \
ICE40_E1_USB_interface (ICE40 based E1 framer IP core developed by \
tnt). \
 \
osmo-e1d acts as an interface between the hardware/firmware of the E1 \
interface on the bottom side, and applications wanting to use E1 \
timeslots on the top side."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "osmo-e1d-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "dd3bc848be6767f6f323cc803bbe54ff44cc72c90072efac857ad5e95ad9f872e44c23ea8aaa296031f5715ad215d9d54a70ed6c2eb3216a88520ea32301f75f"

RPROVIDES:${PN} += "osmo-e1d"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-e1d.so.3 \
libosmo-octoi.so.3 \
libosmocore.so.22 \
libosmousb.so.0 \
libosmovty.so.13 \
libtalloc.so.2 \
libusb-1.0.so.0"

inherit rpm
