SUMMARY = "Serial Sniffer"
DESCRIPTION = "jpnevulator is a serial sniffer. It can be used to send data on a \
serial device, too. It can read or write from/to one or more serial \
devices at the same time. \
 \
In write mode, data to be sent on the serial device(s) is read from a \
file or stdin in hexadecimal notation. Data is sent on the serial \
device(s) line by line. \
 \
In read mode, data to be read from the serial device(s) is written to a \
file or stdout in hexadecimal notation. It is possible to pass the \
data in between the serial device(s). Several options enhance the \
way the data is displayed."
LICENSE = "GPL-2.0-only"

PV = "2.3.6"

RPM_NAME = "jpnevulator-2.3.6-1.22.aarch64.rpm"
RPM_HASH = "9d8109605083897cd70d8730ecefb4c7f8e3aeb39cb02d0eb385549b48a895088bdd58168d07424d0d3fe9a985a427f7545d22bdcd7ab4a9f4ba0102613e6b3a"

RPROVIDES:${PN} += "jpnevulator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
