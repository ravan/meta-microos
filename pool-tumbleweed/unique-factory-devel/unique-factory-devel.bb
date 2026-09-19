SUMMARY = "Header-only C++ UniqueFactory"
DESCRIPTION = "Header-only C++ UniqueFactory"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "unique-factory-devel-0.2.2-1.3.aarch64.rpm"
RPM_HASH = "241ccc8cdd75205957f800e89d5ef3e640740022b4d11db347147e9bc6c7f278fcc7b1d740369160630ba97cd99fcb321beeb725c798a7cd6fdca93204011ef1"

RPROVIDES:${PN} += "unique-factory-devel"

RDEPENDS:${PN} += ""

inherit rpm
