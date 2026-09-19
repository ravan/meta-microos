SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python311-streamz-0.6.4-3.2.noarch.rpm"
RPM_HASH = "3e9c4613572047159cc85d6a85810721c2c3957e15fe17d1ccfcfab37de7199cd09d055973c005dd65f1fdcc1eb959654bdb332118f0462b22675095645f41dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-streamz \
python3.11dist-streamz \
python311-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python311-setuptools \
python311-six \
python311-toolz \
python311-tornado \
python311-zict"

inherit rpm
