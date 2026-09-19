SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.6"

RPM_NAME = "python314-streamz-0.6.6-1.2.noarch.rpm"
RPM_HASH = "3668040655258ac1d7b8a50dbc86f67d47df761cefdf88f7f075270c67e8492d150e560f42883c018081a59f476d9fdf41610e9647a9a1f53d97bec00bd0e5c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-streamz \
python314-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python314-toolz \
python314-tornado \
python314-zict"

inherit rpm
