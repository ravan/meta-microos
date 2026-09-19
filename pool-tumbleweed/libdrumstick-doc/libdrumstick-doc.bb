SUMMARY = "Development documentation package for the drumstick libraries"
DESCRIPTION = "This package contains the developer's documentation of the drumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-doc-2.11.1-1.1.noarch.rpm"
RPM_HASH = "36b0fc6917ec6bb17d5d029285d7d08f3dc1c7a44fa4f9db8ceb8e47b89dd62cad55195c8829d68d6b9843a800a1c0597823bf30dbc1d62ebf7105c60812457a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdrumstick-doc"

RDEPENDS:${PN} += ""

inherit rpm
