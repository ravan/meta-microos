SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.11.0"

RPM_NAME = "python314-pytest-jupyter-client-0.11.0-1.5.noarch.rpm"
RPM_HASH = "9b8219c39cf2a230a79eb8079906c1bb6f210aa9f64f7a34d32d820f701069d5a3cc1630110e54cde627f48b5f69de32488dcfde73f110875510a7a7d739d160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pytest-jupyter-client"

RDEPENDS:${PN} += "python314-ipykernel \
python314-jupyter-client \
python314-nbformat \
python314-pytest-jupyter"

inherit rpm
