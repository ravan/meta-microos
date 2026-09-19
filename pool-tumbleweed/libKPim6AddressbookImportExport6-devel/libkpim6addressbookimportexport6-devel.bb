SUMMARY = "Development headers for libKPimAddressbookImportExport"
DESCRIPTION = "This package includes development headers needed to develop and build import/export plugins \
for KAddressbook."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AddressbookImportExport6-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "356aae157146db50804613a3e0836a3753657683c1f9b8e46ba7c00768432fcc4c279c8b1b444bf191530c5668c628763986f04b53a51a060b06874b13e36a4e"

RPROVIDES:${PN} += "cmake-KPim6AddressbookImportExport \
libKPim6AddressbookImportExport6-devel"

RDEPENDS:${PN} += "libKPim6AddressbookImportExport6"

inherit rpm
