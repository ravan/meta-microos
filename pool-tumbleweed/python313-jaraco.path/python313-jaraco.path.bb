SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python313-jaraco.path-3.7.2-1.5.noarch.rpm"
RPM_HASH = "9ad8c899c9b6b00c1256c9db412c9b6e9b0628cf8bd3d5da8a2ff9010374e42f96389a27d3622989974d7a8692f4a67dd2de792cf16e1d7210d7d2b9f115b5a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.path \
python3.13dist-jaraco.path \
python313-jaraco.path \
python3dist-jaraco.path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
