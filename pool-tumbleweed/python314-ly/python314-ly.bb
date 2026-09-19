SUMMARY = "Tool and library for manipulating LilyPond files"
DESCRIPTION = "Tool and library for manipulating LilyPond files"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.9"

RPM_NAME = "python314-ly-0.9.9-1.9.noarch.rpm"
RPM_HASH = "eb964b98bef525ee10c97f288f6b2204c0c8359125d12149344326e585a705521ee99dc5c8327e1ffdab624210e16995bf80f2dd160a2fc3188ce7d5bd207740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-ly \
python314-ly \
python3dist-python-ly"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
