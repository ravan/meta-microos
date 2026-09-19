SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python314-semantic_version-2.10.0-6.3.noarch.rpm"
RPM_HASH = "bce6da7a248ffcc9c9a42d5e98d20485087ce9e48f1d3479493c8a8afc73bbecb26e43103614bcdd2d0e27008c6787dbaca709d01be8e69ae5497a2e48bbf0d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-semantic-version \
python314-semantic-version \
python3dist-semantic-version"

RDEPENDS:${PN} += "python-abi"

inherit rpm
