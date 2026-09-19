SUMMARY = "Tools to create anonymous, machine-friendly problem reports"
DESCRIPTION = "Satyr is a library that can be used to create and process microreports. \
Microreports consist of structured data suitable to be analyzed in a fully \
automated manner, though they do not necessarily contain sufficient information \
to fix the underlying problem. The reports are designed not to contain any \
potentially sensitive data to eliminate the need for review before submission. \
Included is a tool that can create microreports and perform some basic \
operations on them."
LICENSE = "GPL-2.0-or-later"

PV = "0.43"

RPM_NAME = "satyr-0.43-5.6.aarch64.rpm"
RPM_HASH = "422cda72a12edf48ba85d3853788d2c72c5a52ec2e149ba940c278c28f0ae47599989134cb33c16bbdbb66863872cb369db9e5c1b30142d4845275da3babbaa4"

RPROVIDES:${PN} += "satyr"

RDEPENDS:${PN} += "glib2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsatyr.so.4"

inherit rpm
