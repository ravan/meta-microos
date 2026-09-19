SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.3.0"

RPM_NAME = "python313-marshmallow-4.3.0-1.2.noarch.rpm"
RPM_HASH = "e42994a9ebe5d774bd80f7229d6bf8f10a88ed0153ba24ad4ecd6b8f15afb038dd9710fc6c96a54a9e553a2f6f18b1579975aa16c0aa9d699522528f32420a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marshmallow \
python3.13dist-marshmallow \
python313-marshmallow \
python3dist-marshmallow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
