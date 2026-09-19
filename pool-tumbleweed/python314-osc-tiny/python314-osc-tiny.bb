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

RPM_NAME = "python314-osc-tiny-0.12.0-1.3.noarch.rpm"
RPM_HASH = "03d3c7ae20edfd2a8dc72f3c3b999fc848b6472c1728430aa2e64ea9ebd056c83fabf6f15583f5d0aca751577bbef62d70adc86c978c2f8c67fe0c9dadf56f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-osc-tiny \
python314-osc-tiny \
python3dist-osc-tiny"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-lxml \
python314-python-dateutil \
python314-pytz \
python314-requests \
python314-urllib3"

inherit rpm
