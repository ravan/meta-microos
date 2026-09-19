SUMMARY = "Python lowlevel functionality shared by logilab projects"
DESCRIPTION = "The package logilab.common contains several modules providing low level \
functionalities shared among some python projects developed by logilab. \
 \
The package is used by pylint, an advanced Python style and syntax \
checker. \
 \
Please note that some of the modules have some extra dependencies. For \
instance, logilab.common.db will require a db-api 2.0 compliant \
database driver."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.0"

RPM_NAME = "python313-logilab-common-2.1.0-1.5.noarch.rpm"
RPM_HASH = "a591a4d36703e1bbd4a241baf8447900ee62c5f8c61d7bce83dbe11b3c2dcf64acaf1aa1f85989eefe6fa53ef4c4622c9588d0a947535e381cd64543ac01b291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logilab-common \
python3.13dist-logilab-common \
python313-logilab-common \
python3dist-logilab-common"

RDEPENDS:${PN} += "python-abi \
python313-mypy-extensions \
python313-setuptools \
python313-typing-extensions"

inherit rpm
