SUMMARY = "Development documents of libfprint"
DESCRIPTION = "This package contains the development documents for libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.10+tod1"

RPM_NAME = "libfprint-doc-1.94.10+tod1-3.1.noarch.rpm"
RPM_HASH = "093c62efc3ca425656dfe2714be9afffc8e3311932abb7c011813ed8af23353e73bd1131154585ef4cfa6fb50539a24c522be3a0a50f4f234b3b7c1fd47018bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
