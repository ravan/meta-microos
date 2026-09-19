SUMMARY = "Shared library part of libmodplug"
DESCRIPTION = "Modplug library based on the ModPlug sound engine. \
- plays 22 different mod formats. \
- plays zip, rar, gzip, and bzip2 compressed mods. \
- plays timidity's GUS patch files (*.pat). \
- plays all types of MIDI files (*.mid). \
- plays textfiles written in the ABC music notation (*.abc)."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.9.0+git20170610.f6dd59a"

RPM_NAME = "libmodplug1-0.8.9.0+git20170610.f6dd59a-3.9.aarch64.rpm"
RPM_HASH = "58c73eeed968fa63b864078a61611dbc3952272e35232d66d51139e9711cc09264bd730760aaa43ff5a37f7733bc8c6bdf7f48eea89a9f8d6c198672d46df40f"

RPROVIDES:${PN} += "libmodplug.so.1 \
libmodplug1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
