SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.4.0"

RPM_NAME = "python314-natsort-8.4.0-5.4.noarch.rpm"
RPM_HASH = "cb2dbd86641a61d25347ae3c53c6c26ce1f900f883d3e81adc298b83f274a1b93cb1cd761fde4e40ed2bc7e8ed1cf5d92c5074ab3c6c734937d8857629090c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-natsort \
python314-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
