SUMMARY = "Make asyncore available for Python 3.12 onwards"
DESCRIPTION = "Make asyncore available for Python 3.12 onwards"
LICENSE = "PSF-2.0"

PV = "1.0.5"

RPM_NAME = "python314-pyasyncore-1.0.5-1.3.noarch.rpm"
RPM_HASH = "6f9998a28269c4f0db19f976da3097233740546b51174b8cc08bcb4f69db81350c6d3ac81a2e4fa0f04e02faa45526fe532945a637571bbd048f14d8f2bf9a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyasyncore \
python314-pyasyncore \
python3dist-pyasyncore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
