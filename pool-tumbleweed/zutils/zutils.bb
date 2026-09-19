SUMMARY = "Collection of utilities for dealing with compressed files"
DESCRIPTION = "Zutils is a collection of utilities able to deal with any combination \
of compressed and uncompressed files transparently. If any given file, \
including standard input, is compressed, its decompressed content is \
used. Compressed files are decompressed on the fly; no temporary files \
are created. \
These utilities are not wrapper scripts but safer and more efficient \
C++ programs. In particular the '--recursive' option is very efficient \
in those utilities supporting it."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "zutils-1.16-1.3.aarch64.rpm"
RPM_HASH = "400c97b4c346e9fb6566ec28dacebadc3bb77fe739355cc2decec8f7782f00bd3e48dd90f799f54991574c0ee48a20f3033077778710a954df184a6ad31a8e3e"

RPROVIDES:${PN} += "config-zutils \
zutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
