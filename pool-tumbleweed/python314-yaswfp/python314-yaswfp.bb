SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0-only"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python314-yaswfp-0+git.1411687316.2a2cc6c-2.5.noarch.rpm"
RPM_HASH = "17c4b773db63539179dcbe8e123a37111cfad6cf5ec23b94bb209689cb5799c05ca31379d8d819798bd302492df40f6c1a4f5e168a849144e3856824e446c7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yaswfp \
python314-yaswfp \
python3dist-yaswfp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
