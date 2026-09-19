SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.20.0"

RPM_NAME = "python314-jupyter-server-test-2.20.0-1.3.noarch.rpm"
RPM_HASH = "bb0a97da6fb1cacaac6b92e236564c31ddf3bf490f0e5efed3e14c03ff7172b2bb9939e0fe18077661607ee0ef0a977db41d4ab80addf6c47c251e25cebe44c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-jupyter-server-test"

RDEPENDS:${PN} += "python314-flaky \
python314-ipykernel \
python314-jupyter-server \
python314-pytest \
python314-pytest-console-scripts \
python314-pytest-jupyter-server \
python314-pytest-timeout \
python314-requests"

inherit rpm
