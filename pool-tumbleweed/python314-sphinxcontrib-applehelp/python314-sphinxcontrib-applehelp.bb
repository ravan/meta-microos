SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-sphinxcontrib-applehelp-2.0.0-1.9.noarch.rpm"
RPM_HASH = "f6cdf72c03540cb955b63e48a4c933dad141e22e4373d3c006836451bf3dbb6451b17d8173922aebff71250e5e821b2ec7d4f4a3ab9b89fa02b66fbf0e4389c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-applehelp \
python314-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
