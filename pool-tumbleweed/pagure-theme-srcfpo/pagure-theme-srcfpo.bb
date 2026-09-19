SUMMARY = "Pagure web interface theme used on src.fedoraproject.org"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as src.fedoraproject.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-theme-srcfpo-5.14.1-3.3.noarch.rpm"
RPM_HASH = "626cdb1c81e02b57a6b162544919f336223d54b962339db86724457efb9a213efa0d943232ce38ef31fa56537daf061917c8b969ae93c505f3979be94b3084f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-srcfpo"

RDEPENDS:${PN} += "pagure"

inherit rpm
