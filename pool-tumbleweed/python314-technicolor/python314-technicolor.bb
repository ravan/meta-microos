SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python314-technicolor-2017.1.16.1544-4.5.noarch.rpm"
RPM_HASH = "13b2a0fb643e6889a345589f60955f40a147e734906cfe2cd3bda9b6c958b78b709c38e374a9a29b1f3ef1b72d639bbf9a4f7dd0d84cf0cd63d9664fca77cf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-technicolor \
python314-technicolor \
python3dist-technicolor"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
