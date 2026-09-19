SUMMARY = "Simple data types for common serialisation formats"
DESCRIPTION = "This module provides some extra datatypes that are used by common \
serialisation formats such as JSON or CBOR. The idea is to have a \
repository of simple/small constants and containers that can be shared by \
different implementations so they become interoperable between each other."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Types-Serialiser-1.01-1.27.noarch.rpm"
RPM_HASH = "ae71c4fe1d294d0fca5b9af39fd7d68df5a2831f7416db7d985394cf10f44e918de891bc95478f35b63f1cf286c96f04ff8c2496328079d7674b8aad510999b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--PP--Boolean \
perl-Types--Serialiser \
perl-Types--Serialiser--BooleanBase \
perl-Types--Serialiser--Error \
perl-Types-Serialiser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-common--sense"

inherit rpm
