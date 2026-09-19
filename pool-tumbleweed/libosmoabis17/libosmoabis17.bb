SUMMARY = "Osmocom GSM A-bis interface library"
DESCRIPTION = "In the GSM system architecture, A-bis is a Base Station \
System-internal interface linking the Base Transceiver Stations (BTS) \
and Base Station Controller (BSC). This interface allows control of \
the radio equipment and radio frequency allocation in the BTS. \
 \
This library contains common/shared code regarding this A-bis \
interface. It also implements drivers for mISDN and DAHDI-based E1 \
cards, as well as some A-bis/IP dialects."
LICENSE = "AGPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libosmoabis17-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "9f381a9e0e071ba3aff989bc96a0dea8e200988a40fbcbb7f1432b7e4d899e351de1d8da621d6d3a64d73136587d48e4332d90af1d6fe1dc2ed83ea620eaa5ab"

RPROVIDES:${PN} += "libosmoabis.so.17 \
libosmoabis17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-e1d.so.3 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmoisdn.so.0 \
libosmonetif.so.11 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
