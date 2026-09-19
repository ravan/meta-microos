SUMMARY = "A simple implementation of the OWL2 RL Profile, as well as a basic RDFS inference"
DESCRIPTION = "A simple implementation of the OWL2 RL Profile, as well as a basic RDFS inference, \
on top of RDFLib. Based mechanical forward chaining."
LICENSE = "W3C"

PV = "7.1.3"

RPM_NAME = "python314-owlrl-7.1.3-1.2.noarch.rpm"
RPM_HASH = "7b336ec01a6620f4bd64b30a675a348535e29e3574e6fb52c0e0e6643bf85bc90ab621652b0713610b3f54c426c5ae46ad3aca0c95d4ca2cbd379e151dfb22ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-owlrl \
python314-owlrl \
python3dist-owlrl"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
