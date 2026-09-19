SUMMARY = "Client API for openSUSE BuildService"
DESCRIPTION = "OSC Tiny provides a minimalistic, transparent and class based client for \
accessing the OpenBuildService API. \
 \
For further details see: \
 \
 * https://osc-tiny.readthedocs.io/en/latest/ \
 * https://openbuildservice.org/ \
 * https://build.opensuse.org/apidocs/index"
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python313-osc-tiny-0.12.0-1.3.noarch.rpm"
RPM_HASH = "62671abc61f8c4a142d5a77ee8b5b01dd57a95dde0c3f6f70243d664aac1e90f9f1eb6ec0872bb8cfb915b5d5f194c5712865c167da5801614da34cf2a007675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osc-tiny \
python3.13dist-osc-tiny \
python313-osc-tiny \
python3dist-osc-tiny"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-lxml \
python313-python-dateutil \
python313-pytz \
python313-requests \
python313-urllib3"

inherit rpm
