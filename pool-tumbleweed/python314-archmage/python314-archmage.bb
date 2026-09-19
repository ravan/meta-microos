SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python314-archmage-0.4.2.1-5.2.noarch.rpm"
RPM_HASH = "833312d578278dbd28c88702fb3797f0c706b0b7ce9ff2dffad6e74d5aeaef90e4917e56675bc3d100c26be060d084bd9f05d78fd6e1fdfbe22af3f64e968c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-archmage \
python314-archmage \
python3dist-archmage"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-beautifulsoup4 \
python314-pychm \
python314-sgmllib3k \
update-alternatives"

inherit rpm
