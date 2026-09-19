SUMMARY = "NewGRF Meta Language"
DESCRIPTION = "A tool to compile nml files to grf or nfo files, making newgrf coding easier."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "nml-0.9.0-1.4.aarch64.rpm"
RPM_HASH = "28a69a23b435fdfec957ff78b95e692c150aa36577c1080d6eafe25f940cb10d764075c5883a1ed7ae028d79040de6d90cdcc97dd4e8a061c8b02f804d56c7a6"

RPROVIDES:${PN} += "nml \
nmlc \
python3.13dist-nml \
python3dist-nml"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-Pillow"

inherit rpm
