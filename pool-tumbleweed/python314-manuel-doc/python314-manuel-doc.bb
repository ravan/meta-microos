SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python314-manuel-doc-1.13.0-2.5.noarch.rpm"
RPM_HASH = "64219c5d62466bced229e25e60d77dafac2a0e1bf747d43bba184ddb750531b183bc780d28bf23c2da6905395a048af589a2d4ab7650c09dbce74c3e23ad1410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-manuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
