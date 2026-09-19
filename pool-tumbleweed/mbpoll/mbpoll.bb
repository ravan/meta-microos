SUMMARY = "Command line utility to communicate with ModBus slave (RTU or TCP)"
DESCRIPTION = "mbpoll uses libmodbus (http://libmodbus.org/). \
Although the syntax of these options is very close modpoll proconX program, \
it is a completely independent project. \
 \
mbpoll can: \
 - read discrete inputs \
 - read and write binary outputs (coil) \
 - read input registers \
 - read and write output registers (holding register) \
 \
The reading and writing registers may be in decimal, hexadecimal or \
floating single precision."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.4"

RPM_NAME = "mbpoll-1.5.4-1.5.aarch64.rpm"
RPM_HASH = "1c906b1f8bcea2528615da9faa822688914b9a81c15458859c16743a07c5971bdeaf6e2b75ea797a80b86d5a1110bb50c7d54463e2fe2d2de554c8111ebc7524"

RPROVIDES:${PN} += "mbpoll"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmodbus.so.5"

inherit rpm
