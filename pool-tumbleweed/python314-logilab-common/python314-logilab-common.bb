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

RPM_NAME = "python314-logilab-common-2.1.0-1.5.noarch.rpm"
RPM_HASH = "db0eed3ac1356e256a19fae614469b82b0b2bf260a1645a36713f5525efac00d0373a2682942639d39f8663f5b0850c9367bb58fc507fa4f0d18840ae45393df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-logilab-common \
python314-logilab-common \
python3dist-logilab-common"

RDEPENDS:${PN} += "python-abi \
python314-mypy-extensions \
python314-setuptools \
python314-typing-extensions"

inherit rpm
