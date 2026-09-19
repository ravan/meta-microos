SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.3.0"

RPM_NAME = "python314-marshmallow-4.3.0-1.2.noarch.rpm"
RPM_HASH = "ce95d19757f31eb6bd4b6fd5d09cf5b60c286f08211f019da739a35e637183b2a485ee5e244905a5ca0c713abb177532b854c8a4112707d2af13808d281a282b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-marshmallow \
python314-marshmallow \
python3dist-marshmallow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
