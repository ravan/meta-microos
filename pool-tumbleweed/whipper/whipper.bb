SUMMARY = "A CD ripper aiming for accuracy over speed"
DESCRIPTION = "Whipper is an audio CD ripper that aims for accuracy over speed. It \
automatically tags tracks using MusicBrainz data, takes drive offsets into \
account, supports AccurateRip, and can rip certain hidden tracks. \
Whipper was forked from the Morituri project, after Morituri development halted."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "whipper-0.10.0-5.4.aarch64.rpm"
RPM_HASH = "a41745700b009b1dc6d9b37293baed850ce3ed202e58f99d1abbeafc12666751e377da57d11ad3fe5d7c708b3e6a327925bf1d3c594d8a32aa5397915d98fb84"

RPROVIDES:${PN} += "python3.13dist-whipper \
python3dist-whipper \
whipper"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
cd-paranoia \
cdrdao \
flac \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile.so.1 \
python-abi \
python3-discid \
python3-gobject \
python3-musicbrainzngs \
python3-mutagen \
python3-pycdio \
python3-ruamel.yaml \
python3-setuptools \
sox \
typelib-GLib"

inherit rpm
