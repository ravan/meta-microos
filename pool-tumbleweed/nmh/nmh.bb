SUMMARY = "Unix Mail Handler"
DESCRIPTION = "nmh (new MH) is a powerful electronic mail handling system. It was \
originally based on version 6.8.3 of the MH message system developed by \
the RAND Corporation and the University of California. It is intended \
to be a (mostly) compatible drop-in replacement for MH. \
 \
nmh consists of a collection of fairly simple single-purpose programs \
to send, receive, save, retrieve, and manipulate e-mail messages. \
Because nmh is a suite rather than a single monolithic program, you may \
freely intersperse nmh commands with other commands at your shell \
prompt or write custom scripts that use these commands in flexible \
ways."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "nmh-1.8-1.10.aarch64.rpm"
RPM_HASH = "0dfc9b1d766adb613660b5cdebcd8fa55e32f451e26034fe24fae87841c2842ca4f4009ef9571493fe58ea6c2c20bf839f16af0615a164e8fb52d7ddbda80314"

RPROVIDES:${PN} += "config-nmh \
mh \
nmh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
less \
libc.so.6 \
libgdbm-compat.so.4 \
libtinfo.so.6 \
smtp-daemon"

inherit rpm
