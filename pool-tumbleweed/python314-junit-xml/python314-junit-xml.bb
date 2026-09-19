SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python314-junit-xml-1.9-3.5.noarch.rpm"
RPM_HASH = "1582ec7826bd799b708b78ec8cb484b08f38a78f80ebbef70a6ba658430067787686a31646c7ab724bad242d4c854f3c904714fd0dbb468e693ccaef27aafe0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-junit-xml \
python314-junit-xml \
python3dist-junit-xml"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
