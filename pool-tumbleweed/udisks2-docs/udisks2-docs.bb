SUMMARY = "Developer documentation for udisks2"
DESCRIPTION = "This package contains developer documentation for udisks2."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "udisks2-docs-2.11.2-1.1.noarch.rpm"
RPM_HASH = "205c7840c70a027bcbc3f5464372514d4d82f14d47ae963822345c9e6ce956186ae0ccc3723625b050917fd4638f0d96407c8d31cc4a9384c309e6b32b80c204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udisks2-docs"

RDEPENDS:${PN} += ""

inherit rpm
