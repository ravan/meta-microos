SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python314-sarge-0.1.8-1.2.noarch.rpm"
RPM_HASH = "c0ea18534ea9357279df2df8790f697b316dd79443a66fbea1997da0a62ad1fab60873eb7ccf2fee8593ad3eb05efde16d65ba00f08103b022a43bcb697c58a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sarge \
python314-sarge \
python3dist-sarge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
