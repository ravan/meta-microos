SUMMARY = "Examples of EFL usage"
DESCRIPTION = "Examples usage of the EFL library."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-examples-1.26.3-37.1.aarch64.rpm"
RPM_HASH = "19efb4e031252a4e55037d0b9eba7453ea0ada0a2875f239f473e992cdab565ae8056e17c9cc7fba868d38ef452987ea5efdad4950e8763922358f06bf8aefd5"

RPROVIDES:${PN} += "efl-examples"

RDEPENDS:${PN} += ""

inherit rpm
