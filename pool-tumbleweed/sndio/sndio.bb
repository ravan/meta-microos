SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "It provides an lightweight audio & MIDI server and a fully documented \
user-space API to access either the server or directly the hardware in \
a uniform way. Sndio is designed to work for desktop applications, but \
pays special attention to synchronization mechanisms and reliability \
required by music applications. Reliability through simplicity are part \
of the project goals."
LICENSE = "ISC"

PV = "1.10.0"

RPM_NAME = "sndio-1.10.0-1.5.aarch64.rpm"
RPM_HASH = "2e07cc26c1aa2dd8933e5cd4324a53ced5860057bc3b389af64d6f5b3afac7edcda795e5df89ad1edc25ac3ba5d9ad923dba7824c1bd56f8ab1b754c19e9da22"

RPROVIDES:${PN} += "sndio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libsndio.so.7"

inherit rpm
