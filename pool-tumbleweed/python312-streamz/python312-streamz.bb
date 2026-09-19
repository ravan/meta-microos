SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python312-streamz-0.6.4-3.2.noarch.rpm"
RPM_HASH = "88b0a79a3c11de663d04f551fc8b4bb513e4c95419cae9d4dbb900125599343f720c79cfb86cd8db210df7aab2a5e01e1e2957ff9d4ef460feead4a9f0b91222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-streamz \
python312-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python312-setuptools \
python312-six \
python312-toolz \
python312-tornado \
python312-zict"

inherit rpm
