SUMMARY = "Audible beat generator"
DESCRIPTION = "A program for the Pantheon Desktop, that produces an audible beat — a click \
or other sound — at regular intervals that the user can set in beats \
per minute (BPM)."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "metronome-1.0.0-2.9.aarch64.rpm"
RPM_HASH = "405276291537cea541b8f4d0c4f96dffa73d84fd488de4bef94cd89a88c71044f61cce42a9a94f9e5f451b102982a318f09ceafd7c07108b6190151daab5548d"

RPROVIDES:${PN} += "metronome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
