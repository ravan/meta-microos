SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-lineup-widget-4.0.0-3.9.noarch.rpm"
RPM_HASH = "28f8a52e0f02fd61d817291b93fbcef5c98772f29d4303a261e6060f3cda6f7771ae60d78db3413c48e397f3b22dfd05f09801fe395590662ce0997d829cbc69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lineup-widget \
python314-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python314-ipywidgets \
python314-pandas"

inherit rpm
