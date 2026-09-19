SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python313-patsy-1.0.2-1.4.noarch.rpm"
RPM_HASH = "d76683a2faceddf61af1c7e8558742889a169be280a0eae650ad18c09be555dd5438db0a1d2acf154846caef0f91e9c03849c9a9a43cbf9008cfb6b1abb472ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patsy \
python3.13dist-patsy \
python313-patsy \
python3dist-patsy"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
