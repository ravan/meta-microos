SUMMARY = "Compact Disc Digital audio extraction library"
DESCRIPTION = "libparanoia is a Compact Disc Digital Audio (CD-DA) Digital Audio \
Extraction (DAE) library for reading audio from the CD-ROM directly \
as data, with no analog step between. Cdparanoia can read audio data \
from inexpensive drives prone to misalignment, frame jitter and loss \
of streaming during atomic reads, and attempt to repair data from CDs \
that have been damaged in some way by use of the error correction \
stored on the disc."
LICENSE = "LGPL-2.1-only"

PV = "3.02~a10"

RPM_NAME = "libparanoia1_0-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "c6d46a281418770406f4bdc7e9988eb0d293eb4117c2867d71e61831b568f09c685c8ef4662bf05833afbb1824dd3eee2caaf41263a2a50cc1ced72d5925aa69"

RPROVIDES:${PN} += "libparanoia.so.1.0 \
libparanoia1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
