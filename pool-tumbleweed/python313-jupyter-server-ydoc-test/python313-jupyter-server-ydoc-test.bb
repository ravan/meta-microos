SUMMARY = "The jupyter_server_ydoc[test] extra"
DESCRIPTION = "Metapackage for the jupyter_server_ydoc[test] extra requirements"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python313-jupyter-server-ydoc-test-2.4.0-1.4.noarch.rpm"
RPM_HASH = "b9b38d76f955e475f5cbc4384c28e6e42dc1063e8dd0f734806881276aae2a882527fdece4ec5f0b91d14748ae0e1a3505b3eae6e5767280405fb4cdd568e73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-ydoc-test \
python313-jupyter-server-ydoc-test"

RDEPENDS:${PN} += "python313-anyio \
python313-dirty-equals \
python313-httpx-ws \
python313-jupyter-server-fileid \
python313-jupyter-server-test \
python313-jupyter-server-ydoc \
python313-pytest"

inherit rpm
