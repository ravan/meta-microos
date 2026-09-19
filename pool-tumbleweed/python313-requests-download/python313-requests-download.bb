SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-requests-download-0.1.2-5.1.noarch.rpm"
RPM_HASH = "b959834261ec6c0e2db227a8a20a41d18c8c1bfc5bb563483503d19091ad8493c9bd263bde25f8f891e1c7d2927a9dd6cdb304cc7866c67ea6e9321d551f2db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-download \
python3.13dist-requests-download \
python313-requests-download \
python3dist-requests-download"

RDEPENDS:${PN} += "python-abi \
python313-progressbar \
python313-requests"

inherit rpm
