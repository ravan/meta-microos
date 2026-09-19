SUMMARY = "Manual and Info pages for libgnutls"
DESCRIPTION = "Manpages (troff) and GNU Info pages for libgnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "libgnutls-devel-doc-3.8.13-3.1.noarch.rpm"
RPM_HASH = "804274dcdbd841128d4fd361fd539d0c1bc123c92fbf02c59124f205de0f9210606a0d9c3a83ef3c8085d62b113c0f148b65a6dc861f4df423ef5969a165ae1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnutls-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
