SUMMARY = "A library implementing the 'SemVer' scheme"
DESCRIPTION = "This small python library provides a few tools to handle `SemVer`_ in Python. \
It follows strictly the 2.0.0 version of the SemVer scheme."
LICENSE = "BSD-2-Clause"

PV = "2.10.0"

RPM_NAME = "python313-semantic_version-2.10.0-6.3.noarch.rpm"
RPM_HASH = "fa1dfe9c67a6ddf3bb62afe55c13e6ec757b3ed099e5a5ae4baec4e8a24ba923a07ec7736c5ac605b8275850b0fbfc8dfcc9a85ae772a52d81a0cab779e56937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-semantic-version \
python3.13dist-semantic-version \
python313-semantic-version \
python3dist-semantic-version"

RDEPENDS:${PN} += "python-abi"

inherit rpm
