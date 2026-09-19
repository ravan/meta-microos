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

RPM_NAME = "python314-envisage-7.0.4-1.2.noarch.rpm"
RPM_HASH = "7374fc49ff261d2bf1c72a16bb38d05abc9e29e27de873cd69e6bd337442208d7555e02e8a4b2c3a2b47eda84208dc6637144a4642eb545dfd7b020c37c93081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-envisage \
python314-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python314-apptools \
python314-pyface \
python314-setuptools \
python314-traits \
python314-traitsui"

inherit rpm
