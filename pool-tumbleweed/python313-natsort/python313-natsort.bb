SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.4.0"

RPM_NAME = "python313-natsort-8.4.0-5.4.noarch.rpm"
RPM_HASH = "a17a7e690f94f510830ececdb7f4457b3fbf352c95d475dc5b9f53498b12e12b7e48a9f1208e924c5a45955d269345a2d4f5f7d792126ccacea113c4ecf6a68a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-natsort \
python3.13dist-natsort \
python313-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
