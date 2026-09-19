SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.11.0"

RPM_NAME = "python314-pytest-jupyter-server-0.11.0-1.5.noarch.rpm"
RPM_HASH = "07f4286a55d5c4297275eb2ff7a8f048d6e2dbd24ea84818c45df19db85db3a01f23fd982ca317e87a2d0b015df6d7dd22ff638fa3451637aae03c279324531e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pytest-jupyter-server"

RDEPENDS:${PN} += "python314-ipykernel \
python314-jupyter-client \
python314-jupyter-server \
python314-nbformat \
python314-pytest-jupyter"

inherit rpm
