SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python313-manuel-1.13.0-2.5.noarch.rpm"
RPM_HASH = "b5f7a22fb24c797ade685f5663b0a970037f991aa7a4b43a90181a81a4dcab67b9919cf0d2a6f38f903b69779b48e9be1c3a9e47a28cc69c9cf06f6ec0addd1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manuel \
python3.13dist-manuel \
python313-manuel \
python3dist-manuel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
