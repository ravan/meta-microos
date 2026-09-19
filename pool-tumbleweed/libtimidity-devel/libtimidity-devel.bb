SUMMARY = "MIDI to WAVE converter library - Development Files"
DESCRIPTION = "This library is based on the TiMidity decoder from SDL_sound library. \
Purpose to create this library is to avoid unnecessary dependences. \
SDL_sound requires SDL and some other libraries, that not needed to \
process MIDI files. In addition libtimidity provides more suitable \
API to work with MIDI songs, it enables to specify full path to the \
timidity configuration file, and have function to retrieve meta data \
from MIDI song."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "libtimidity-devel-0.2.7-1.14.aarch64.rpm"
RPM_HASH = "a93909f9a342385f336745d88695e8dbd5119af454844c33d18f6510b3624d667813a1cd600afbed730a91bb323a6c2d816ebbfd7655085e7b21b554485255ba"

RPROVIDES:${PN} += "libtimidity-devel \
pkgconfig-libtimidity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtimidity2"

inherit rpm
