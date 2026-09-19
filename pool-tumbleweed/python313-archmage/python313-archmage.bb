SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python313-archmage-0.4.2.1-5.2.noarch.rpm"
RPM_HASH = "c9c86fce58cdb16273f5095df1a61a2b29a5e0a27fbaff9a1b93402d73dfb1f0a34f1bbe804d6f5d643ad77e1ddb300f4b14ebf39a0abb25cd733cfa4d98745a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "archmage \
python3-archmage \
python3.13dist-archmage \
python313-archmage \
python3dist-archmage"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-beautifulsoup4 \
python313-pychm \
python313-sgmllib3k \
update-alternatives"

inherit rpm
