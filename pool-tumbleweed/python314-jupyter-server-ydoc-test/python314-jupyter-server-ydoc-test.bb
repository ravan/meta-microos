SUMMARY = "The jupyter_server_ydoc[test] extra"
DESCRIPTION = "Metapackage for the jupyter_server_ydoc[test] extra requirements"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python314-jupyter-server-ydoc-test-2.4.0-1.4.noarch.rpm"
RPM_HASH = "7df97c860474cd0bf25280cab2330df9560ad7f68487ff78edade4be809fe2319cc855a4f95f07b7fad85e1692c30221d29b9283bda2f4761efdc634ee377910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-jupyter-server-ydoc-test"

RDEPENDS:${PN} += "python314-anyio \
python314-dirty-equals \
python314-httpx-ws \
python314-jupyter-server-fileid \
python314-jupyter-server-test \
python314-jupyter-server-ydoc \
python314-pytest"

inherit rpm
