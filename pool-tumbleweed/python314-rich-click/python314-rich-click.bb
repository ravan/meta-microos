SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.9.8"

RPM_NAME = "python314-rich-click-1.9.8-1.2.noarch.rpm"
RPM_HASH = "adf6e4671f4cea2551e9cfaa63c3b55a6e733d198e0d0ec146c6a1f99d309fc024a06783928bcffff067f077b0b750d8b22e54eb25afc442427efeb11255ac50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rich-click \
python314-rich-click \
python3dist-rich-click"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-rich"

inherit rpm
