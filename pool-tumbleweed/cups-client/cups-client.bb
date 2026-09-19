SUMMARY = "CUPS Client Programs"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. A computer running CUPS is a host that can accept print \
jobs from client computers, process them, and send them to the \
appropriate printer. \
 \
This package contains the traditional command line interfaces for the \
System V and Berkeley print systems."
LICENSE = "Apache-2.0"

PV = "2.4.19"

RPM_NAME = "cups-client-2.4.19-3.1.aarch64.rpm"
RPM_HASH = "5528aa54a6ac3ae2ecbba1df926b9d8a9666af640508f6feed697e2250a547e6a4447487601af5282f93018f7fb2be70af6b5163e68b879b9cec2da7ef29c35a"

RPROVIDES:${PN} += "cups-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcups.so.2 \
libcups2 \
libcupsimage2 \
libpam.so.0"

inherit rpm
