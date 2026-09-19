SUMMARY = "PC/SC IFD Handler for the ECO 5000 Serial Smart Card Reader"
DESCRIPTION = "Driver for the ECO 5000 Serial Smart Card Reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package. \
 \
This interface allows access to the terminal using the Card Terminal \
Basic Command Set (CT-BCS). This driver also includes the support for \
memory cards, exposed as Interindustry Command Set for Synchronous \
Cards. \
 \
The CT-API driver supports the IFD Handler interface from PC/SC. \
 \
Please take a look in the included README document for further \
information. \
 \
This driver only works with the serial interface version of the ECO \
5000. ORGA also sells a USB version, that is incompatible with the \
serial version. This driver will not work with the USB version!"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "pcsc-eco5000-1.2.0-91.5.aarch64.rpm"
RPM_HASH = "943f3752db3e81db1ac3b7d7996ddf6326541848a435e9751f65aa5c758d88f6e48a379accdd314a23760adc3c66b73af8dfdec77323be0f24c1841b705441c9"

RPROVIDES:${PN} += "libcteco5000.so.0 \
pcsc-eco5000"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-lite"

inherit rpm
