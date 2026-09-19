SUMMARY = "The Common UNIX Printing System"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. A computer running CUPS is a host that can accept print \
jobs from client computers, process them, and send them to the \
appropriate printer. \
 \
CUPS consists of a print spooler and scheduler, a filter system that \
converts the print data to a format that the printer will understand, \
and a backend system that sends this data to the print device. CUPS \
uses the Internet Printing Protocol (IPP) as the basis for managing \
print jobs and queues. It also provides the traditional command line \
interfaces for the System V and Berkeley print systems, and provides \
support for the Berkeley print system's Line Printer Daemon protocol \
and limited support for the server message block (SMB) protocol. \
 \
CUPS comes with a built-in web-based interface."
LICENSE = "Apache-2.0"

PV = "2.4.19"

RPM_NAME = "cups-2.4.19-3.1.aarch64.rpm"
RPM_HASH = "f921c495ab4359a546882686324e0c8165a2c4bfc0285aa9f26cd94e6ea4f5b9342358d2ca43a25496a243f9d15cf01ea6a89d0cd868859437a613ca54ba90d3"

RPROVIDES:${PN} += "config-cups \
cups"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/sbin/groupadd \
coreutils \
cups-client \
cups-config \
group-lp \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
libm.so.6 \
libpam.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libusb-1.0.so.0 \
systemd"

inherit rpm
