SUMMARY = "Translations for package qgis"
DESCRIPTION = "Provides translations for the 'qgis' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "qgis-lang-4.2.1-1.2.noarch.rpm"
RPM_HASH = "046cf2f7679a66bff588b3ea8abebaf8280a051f8e6de74bd53d507ee02906546abefaea619a1da0c3903e44836b28c8b89e24b2fd0c81c28b1e7f32fd7ae7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qgis-lang \
qgis-lang-all"

RDEPENDS:${PN} += "qgis"

inherit rpm
