SUMMARY = "Extensible application framework for Python"
DESCRIPTION = "Envisage is a Python-based framework for building extensible \
applications, that is, applications whose functionality can be \
extended by adding 'plug-ins'. Envisage provides a standard mechanism \
for features to be added to an application. When building an \
application using Envisage, the entire application consists primarily \
of plug-ins. In this respect, it is similar to the Eclipse and \
Netbeans frameworks for Java applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & Python-2.0 & LGPL-3.0-only & CC-BY-SA-1.0 & CC-BY-SA-2.0 & CC-BY-SA-2.5 & CC-BY-SA-3.0 & LicenseRef-SUSE-Public-Domain"

PV = "7.0.4"

RPM_NAME = "python313-envisage-7.0.4-1.2.noarch.rpm"
RPM_HASH = "db1bdac8c3fb7e012d1b398a56d1f5f24113456bc06f9399ade9b441647c75bb7f25ef1c82154072420aedd7838295d4ed6468d6d1f5804442ffee053840a223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-envisage \
python3.13dist-envisage \
python313-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python313-apptools \
python313-pyface \
python313-setuptools \
python313-traits \
python313-traitsui"

inherit rpm
