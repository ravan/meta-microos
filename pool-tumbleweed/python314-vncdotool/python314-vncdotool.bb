SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-vncdotool-1.3.0-1.2.noarch.rpm"
RPM_HASH = "5c169a297c90264b3237965b553a0446b3b3c48ed7ce2167fd303f4bf412099118d893fa36a2de2db41241c36c6aa27590d6121466a66d00c3e816f64c006e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vncdotool \
python314-vncdotool \
python3dist-vncdotool"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pillow \
python314-Twisted \
python314-cryptography"

inherit rpm
