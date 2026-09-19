SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python314-sphinxcontrib-issuetracker-0.11-11.5.noarch.rpm"
RPM_HASH = "810e7fb4035d86b4c4e881dbe0b310cc03a141ad416b280eef3817bcf9a4c014e96a82e736ab88e8f2f5bea10b9fa27e768f7c514fab44ef43331e8ed8e0fabe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-issuetracker \
python314-sphinxcontrib-issuetracker \
python3dist-sphinxcontrib-issuetracker"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-requests"

inherit rpm
