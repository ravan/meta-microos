SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.2"

RPM_NAME = "python314-srcinfo-0.1.2-3.5.noarch.rpm"
RPM_HASH = "3ebdca9070a157ce8d3a10ddf9c9cfb4bbede3690188dc5683c1b854c9f31169db586fd4c3962dbd55cebafb9808a6d4e879717c5345d41047f7e6aaf6ad2bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-srcinfo \
python314-srcinfo \
python3dist-srcinfo"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-parse"

inherit rpm
