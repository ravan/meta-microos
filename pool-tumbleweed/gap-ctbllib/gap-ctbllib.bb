SUMMARY = "GAP Character Table Library"
DESCRIPTION = "The package contains the GAP Character Table Library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "gap-ctbllib-1.3.11-1.4.noarch.rpm"
RPM_HASH = "b340c67caad0e2c7802dd2fbaaf6315e6b62a11a8e9b7ba40ee3f16c9783a8c123c7621d43d8c96c6c5c9439f3650eafce2d2b7004db8d850484c1253cf43ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-ctbllib"

RDEPENDS:${PN} += "gap-atlasrep \
gap-core \
gap-gapdoc"

inherit rpm
