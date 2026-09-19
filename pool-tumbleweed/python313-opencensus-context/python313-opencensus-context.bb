SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python313-opencensus-context-0.1.3-3.5.noarch.rpm"
RPM_HASH = "036094b7f9f7b22121843cef5e6451e8d2d7e6ee0d07f100792ee7f3aa21e4783f43471f5924a58c08df577436f7241b5cef039c531e451f54ddf5db2bfe4009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-context \
python3.13dist-opencensus-context \
python313-opencensus-context \
python3dist-opencensus-context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
