SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "Developer manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-devel-doc-html-2.8.5-2.2.noarch.rpm"
RPM_HASH = "93bda6fcddab05de7243df9f048d0ac61baa761b68f252fe99858ec08f0fc54e6d4886212fd6b9f25aa21a6238a92a08564601cf445da9f609f2c4ac763b08d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-devel-doc-html"

RDEPENDS:${PN} += "nut-doc-html \
nut-doc-images"

inherit rpm
