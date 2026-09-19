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

RPM_NAME = "python311-envisage-6.1.1-2.1.noarch.rpm"
RPM_HASH = "479cc3bbdac2fc932cc5ad4d3c8fcc91b386a8a0efecb4e8f29768eb7774d7112c859f034914ba830a3aa054a50144f0cd944b60f8cf7a3801d0ca3f0fdc22ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-envisage \
python311-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python311-traits"

inherit rpm
