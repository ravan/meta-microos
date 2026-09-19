SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.20.0"

RPM_NAME = "python313-jupyter-server-test-2.20.0-1.3.noarch.rpm"
RPM_HASH = "960ee9a2058164d9d4a852677481d456d67ab516f835796fdabf227266fd45978c2f1073ffcef681ed214f96da04a612fa5b804aca203114d62902db3ac64149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-test \
python313-jupyter-server-test"

RDEPENDS:${PN} += "python313-flaky \
python313-ipykernel \
python313-jupyter-server \
python313-pytest \
python313-pytest-console-scripts \
python313-pytest-jupyter-server \
python313-pytest-timeout \
python313-requests"

inherit rpm
