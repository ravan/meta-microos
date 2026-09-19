SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.10.4"

RPM_NAME = "python314-nbclient-0.10.4-1.5.noarch.rpm"
RPM_HASH = "bc024fa4af73a3e1f4c31fb043a55a30df953db60e578a7259b8b6214254fbc5e9e8382cb6e4577f5a0efbdc580aab78057d5eb37f22a576fa977c2b946ca33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nbclient \
python314-nbclient \
python3dist-nbclient"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-jupyter-client \
python314-nbformat \
python314-traitlets"

inherit rpm
