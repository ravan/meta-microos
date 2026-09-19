SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.10.4"

RPM_NAME = "python314-nbformat-5.10.4-3.8.noarch.rpm"
RPM_HASH = "b2daefe73566848ac14ecf9496458cd18ba39de401b7c30ca8bf89d6497b7f7ffca4dabae429485f73b9610961447c6855a56067f33e2b2afa0f21585c05d797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nbformat \
python314-jupyter-nbformat \
python314-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-fastjsonschema \
python314-jsonschema \
python314-traitlets"

inherit rpm
