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
LICENSE = "BSD-3-Clause & Python-2.0 & LGPL-3.0-only & CC-BY-SA-1.0 & CC-BY-SA-2.0 & CC-BY-SA-2.5 & CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "6.1.1"

RPM_NAME = "python312-envisage-6.1.1-2.1.noarch.rpm"
RPM_HASH = "fb162e317ca41f3f16724fb868c77b433c8beb3595eda5e7f577fb9f6deccf6958d2b5490fa81fcd1438abdfeb046619d265cccdc7b03b479eaf7b725ec21437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-envisage \
python312-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python312-traits"

inherit rpm
