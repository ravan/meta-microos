SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "python313-requests-futures-1.0.2-1.5.noarch.rpm"
RPM_HASH = "541a6e4175fda13c015891a1ac62a07afc1bb58955c7599c4c1f87aca98bb7a848dc3d297cbcf665bd653566a907ce85386ddda521ca93bd89e3e2a1c828d77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-futures \
python3.13dist-requests-futures \
python313-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
