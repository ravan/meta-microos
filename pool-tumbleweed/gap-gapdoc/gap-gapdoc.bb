SUMMARY = "GAP: package for GAP Documentation"
DESCRIPTION = "This package contains a definition of a structure for GAP (package) \
documentation, based on XML. It also contains conversion programs for \
producing text, PDF or HTML versions of such documents, with \
hyperlinks, if possible."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "gap-gapdoc-1.6.10-1.2.noarch.rpm"
RPM_HASH = "93e643d88d37ee8f82935aa354461de2da203f52534d7229b97d75f12df147249a074477f3a0dde73ee8b7997aef808018002ae3fcd87c68aae57d4274593dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-gapdoc"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-core"

inherit rpm
