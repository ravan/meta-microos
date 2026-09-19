SUMMARY = "Program to dump raw CD data to files"
DESCRIPTION = "The readcd program can be used to read optical media and write the \
contents, including subchannels and error correction codes, to files. \
It can be used to write to DVD-RAM too, but other media types should \
use cdrecord which supports a lot more media types."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "readcd-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "6de1a19be2f6dd42e489a082b27825514d8729f079bbdfc9923451489dcba889db9c0a60272ff6f631b1966ed1eb90889dc56306991dde0e0aa36e9977f7e261"

RPROVIDES:${PN} += "cdrecord-/usr/bin/readcd \
readcd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcdrdeflt.so.1.0 \
libedc-ecc-dec.so.1.0 \
librmt.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
permissions"

inherit rpm
