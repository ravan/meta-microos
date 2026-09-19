SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.28.0"

RPM_NAME = "python313-jupyterlab-server-test-2.28.0-2.4.noarch.rpm"
RPM_HASH = "648c493c1731923b14e5438ab66bd7f4c9f390ed91ba2c16760085a8d469f32efb141784f507a9a8326d619e7f8860c4580cb05389c0c16c21eafde63f722971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-test \
python313-jupyterlab-server-test"

RDEPENDS:${PN} += "python313-Werkzeug \
python313-ipykernel \
python313-jupyterlab-server \
python313-openapi-spec-validator \
python313-pytest \
python313-pytest-console-scripts \
python313-pytest-jupyter-server \
python313-pytest-timeout \
python313-requests-mock \
python313-ruamel.yaml \
python313-strict-rfc3339"

inherit rpm
