SUMMARY = "Documentation files for python-six-test"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. \
 \
This package provides documentation for python-six-test."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python-six-doc-1.17.0-2.1.noarch.rpm"
RPM_HASH = "afb8d26643ea449dc23445a7036d2ffab4b67f7893a18ed4a11f7f3cdf20c4bc759562041f7932ef53a4e9e72a5eb068bc5420c088fdbf8c9263251fd8f04c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-six-doc \
python313-six-doc \
python314-six-doc"

RDEPENDS:${PN} += ""

inherit rpm
