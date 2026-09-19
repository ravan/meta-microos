SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python314-titlecase-2.4.1-2.5.noarch.rpm"
RPM_HASH = "34f3855503377594a967c7e4d82ee7936af189d02ea48b2b7f9291ccb0caa167d880849d8de7ab909641400014106dccefb10eec59575dfc21c3ab650e55176f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-titlecase \
python314-titlecase \
python3dist-titlecase"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-regex \
update-alternatives"

inherit rpm
