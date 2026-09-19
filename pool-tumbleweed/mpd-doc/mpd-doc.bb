SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.15"

RPM_NAME = "mpd-doc-0.24.15-1.1.noarch.rpm"
RPM_HASH = "6e5f15a936ae56ff313028a3d166132b5fc03795a3b1018329ff0bde238c66d232d8d2c923731fc399674cddd253e58f55edc93740fa9e5d1ca5f14b4b6f6520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpd-doc"

RDEPENDS:${PN} += ""

inherit rpm
