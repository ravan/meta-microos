SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python314-manuel-1.13.0-2.5.noarch.rpm"
RPM_HASH = "d77dfa1b74742af259e3c8cb46738e96374700513832727bf6e3e2837ea60d0325f2762a652af3a4b1af0c7f0855e152e13fd26fd101cfcb94e23dfcec0cc8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-manuel \
python314-manuel \
python3dist-manuel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
