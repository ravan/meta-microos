SUMMARY = "Development headers for picom"
DESCRIPTION = "Development headers for picom"
LICENSE = "MIT & MPL-2.0"

PV = "13"

RPM_NAME = "picom-devel-13-1.6.noarch.rpm"
RPM_HASH = "4c7ebc9da41ded09ee4390d21038c03ef0886fd6809d2f74a5ebe304283e5a3d611656102329755c2fbefd7d9a1ef6f83f41cb0e6d7d522ca60e367369e41d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picom-devel"

RDEPENDS:${PN} += ""

inherit rpm
