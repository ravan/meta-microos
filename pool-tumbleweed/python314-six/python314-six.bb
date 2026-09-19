SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python314-six-1.17.0-2.1.noarch.rpm"
RPM_HASH = "2267e4402b8446388eb8f72b61835cc587cc1e560411cef88c893dcd597702ebcd4bce711967387af237907a9f6d23be213ffc4315226c570aadda27f6addd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-six \
python314-six \
python3dist-six"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
