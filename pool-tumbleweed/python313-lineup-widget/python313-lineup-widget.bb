SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-lineup-widget-4.0.0-3.9.noarch.rpm"
RPM_HASH = "a163ef36829373b6b8bbdf53bd75975709e11af32c0bbd650402ad5d81e02e7dc50bd0489ca4fb1e5a614645a89cb7a9ffc5de11d75fbe873c9a4b5e123cc21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lineup-widget \
python3.13dist-lineup-widget \
python313-lineup-widget \
python3dist-lineup-widget"

RDEPENDS:${PN} += "python-abi \
python313-ipywidgets \
python313-pandas"

inherit rpm
