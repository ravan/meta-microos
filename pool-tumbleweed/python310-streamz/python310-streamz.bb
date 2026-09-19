SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python310-streamz-0.6.4-3.2.noarch.rpm"
RPM_HASH = "33df554a6c96f3706a9348c50c50c0070975770752ecc8ee10b6f1cc07ca5c1014baf386a8ab3da82e8649a2e9cf512cae836473c3b9bd18477da92f9c999c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-streamz \
python310-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python310-setuptools \
python310-six \
python310-toolz \
python310-tornado \
python310-zict"

inherit rpm
