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

RPM_NAME = "python310-envisage-6.1.1-1.6.noarch.rpm"
RPM_HASH = "6e80d8ced28d708015fdf21288f6950a0b6e3e8642dee3978075057b84bcc8cbd145d06f0eee8dffb1092ff0c3a8275e8d434d251f30c2f230fb93a2a6062a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-envisage \
python310-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python310-traits"

inherit rpm
