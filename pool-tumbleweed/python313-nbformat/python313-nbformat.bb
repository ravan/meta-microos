SUMMARY = "The Jupyter Notebook format"
DESCRIPTION = "This package contains the base implementation of the Jupyter Notebook format, \
and Python APIs for working with notebooks. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "5.10.4"

RPM_NAME = "python313-nbformat-5.10.4-3.8.noarch.rpm"
RPM_HASH = "416905359e25d9735c24f1f02fa1b2025ad51dab753abe5bc9738f4eb4975dc6cd3abd89c7c39297c1b8184378d26969de6ebe7760aedaa6ac156a393c57a5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbformat \
python3-nbformat \
python3.13dist-nbformat \
python313-jupyter-nbformat \
python313-nbformat \
python3dist-nbformat"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-fastjsonschema \
python313-jsonschema \
python313-traitlets"

inherit rpm
