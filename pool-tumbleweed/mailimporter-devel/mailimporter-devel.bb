SUMMARY = "Development package for mailimporter"
DESCRIPTION = "This package provides the development headers of the mailimporter library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "mailimporter-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a5bc40c4219bdc75a935573d4b3fb5ff7bf989fc0ae28598e70d567353291d86dd76e8bb5b0a1237d46e5807fa2c99bb0461fdb2828d73b95dd3f382226b52ef"

RPROVIDES:${PN} += "cmake-KPim6MailImporter \
cmake-KPim6MailImporterAkonadi \
mailimporter-devel"

RDEPENDS:${PN} += "cmake-KF6Archive \
libKPim6MailImporter6 \
libKPim6MailImporterAkonadi6"

inherit rpm
