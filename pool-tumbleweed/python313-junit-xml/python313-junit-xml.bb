SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python313-junit-xml-1.9-3.5.noarch.rpm"
RPM_HASH = "288e2306552196700f533147e063d07de41dd7a38230f11a2dd760061d33ab7d590e5915649b660c630727e4b24efe2e2824b3745905c216e603799c447b972e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junit-xml \
python3.13dist-junit-xml \
python313-junit-xml \
python3dist-junit-xml"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
