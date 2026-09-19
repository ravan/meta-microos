SUMMARY = "Jigsaw Download"
DESCRIPTION = "Jigsaw Download, or jigdo, is an intelligent tool that can be used on \
the pieces of any chopped-up big file to create a special template file \
that makes reassembly of the file very easy for users who only have the \
pieces. What makes jigdo special is that there are no restrictions on \
what offsets or sizes the individual pieces have in the original big \
image. This makes the program very well suited for distributing CD or \
DVD images (or large zip or tar archives) because you can put the files \
of the CD on an FTP server--when jigdo is presented the files along \
with the template you generated, it is able to recreate the CD image."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "jigdo-0.8.2-1.10.aarch64.rpm"
RPM_HASH = "c3ad67e102de856a37c26716d9f0b5ccb0aeba965a3a5ff8481657e152e3f608ed6142c75eb40e0fa943a90e3859e25721743ba533a834ffc7c1c04c0287cadb"

RPROVIDES:${PN} += "jigdo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libdb-4.8.so \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
wget"

inherit rpm
