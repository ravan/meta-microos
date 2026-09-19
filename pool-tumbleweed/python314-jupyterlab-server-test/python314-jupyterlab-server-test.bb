SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.28.0"

RPM_NAME = "python314-jupyterlab-server-test-2.28.0-2.4.noarch.rpm"
RPM_HASH = "247c294155ef3879dc75b43894a8dc9f08cd856fab18fa699ff87f1f2d1daf748ad9148c042df953a97f742c1932149a67262c0267354a42eae97cb96711efed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-jupyterlab-server-test"

RDEPENDS:${PN} += "python314-Werkzeug \
python314-ipykernel \
python314-jupyterlab-server \
python314-openapi-spec-validator \
python314-pytest \
python314-pytest-console-scripts \
python314-pytest-jupyter-server \
python314-pytest-timeout \
python314-requests-mock \
python314-ruamel.yaml \
python314-strict-rfc3339"

inherit rpm
