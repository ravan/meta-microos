SUMMARY = "GUI front-end of fontconfig"
DESCRIPTION = "A front-end for fontconfig. Setup perfect font effects, fast and easily. \
 \
* Choose fonts by font family and language \
* Combine English font and Chinese font \
* Setup font render options, including hinting, antialias, subpixel rendering \
* Font replacement. Use installed fonts render missing fonts. \
* Scheme management, 1-click setup and Reset system default functions."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "fontweak-1.3.1-3.11.noarch.rpm"
RPM_HASH = "a670a7347c50b38654ff932f25da8240f12401403d6412491fe8a7cbfb4c58e3dea7f5e0516821430f570a1946f1c865a4c02941badc891f03207335e3fdcdb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontweak"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
