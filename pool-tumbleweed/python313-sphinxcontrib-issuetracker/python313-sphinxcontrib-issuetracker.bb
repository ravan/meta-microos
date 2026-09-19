SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python313-sphinxcontrib-issuetracker-0.11-11.5.noarch.rpm"
RPM_HASH = "f88d3a263f421aa8e9db618c90c232721bbb14242ea282b07d4d0553c370d13db3e37c2f0f684506ebe3dd3fa5f54bf74dd717ed78851abbeeeb8184706212b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-issuetracker \
python3.13dist-sphinxcontrib-issuetracker \
python313-sphinxcontrib-issuetracker \
python3dist-sphinxcontrib-issuetracker"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-requests"

inherit rpm
