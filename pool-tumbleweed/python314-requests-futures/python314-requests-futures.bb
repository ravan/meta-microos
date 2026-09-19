SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "python314-requests-futures-1.0.2-1.5.noarch.rpm"
RPM_HASH = "6ee8d8a5c4744665a531467e12605643a5467e97181c71ef7f1d92a0b835ff796bb346ceff02e1bb60e8e9212ef238530d14efec4adedc1900083982490b3b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-futures \
python314-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
