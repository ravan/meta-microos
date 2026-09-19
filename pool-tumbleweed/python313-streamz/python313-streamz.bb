SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python313-streamz-0.6.6-1.2.noarch.rpm"
RPM_HASH = "bd62f5188b14df189c165b5049364163e0d3b2d89e985f127b7e1ac9801ecca1abb3d8e3004279a4f3292969e4a185ac54c17ed9f344cb8cb0f49b13c3a37eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-streamz \
python3.13dist-streamz \
python313-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python313-toolz \
python313-tornado \
python313-zict"

inherit rpm
