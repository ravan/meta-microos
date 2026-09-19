SUMMARY = "A client library for executing notebooks"
DESCRIPTION = "A client library for executing notebooks. Formally nbconvert's \
ExecutePreprocessor. \
 \
NBClient is a tool for parameterizing andexecuting Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "0.10.4"

RPM_NAME = "python313-nbclient-0.10.4-1.5.noarch.rpm"
RPM_HASH = "2f80439d6f0c575345a2ec1aea6a89c1b866ec4e91a8b4ef860e095d771dae75d19c283a52bb9ebcda546a8969ab44b3632e3512dec86e50524862fb13c7ac0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbclient \
python3.13dist-nbclient \
python313-nbclient \
python3dist-nbclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-jupyter-client \
python313-nbformat \
python313-traitlets"

inherit rpm
