SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python314-patsy-1.0.2-1.4.noarch.rpm"
RPM_HASH = "f9ef177fc537e9fa2ff3d97a28c380b00bd42029393896a69d0dc163b0f9a7af12a15964e0d3a03d1e86679949c76f9d947fe8f9c417031a304859e24c764da7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-patsy \
python314-patsy \
python3dist-patsy"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
