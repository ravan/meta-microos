SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python313-requests-wsgi-adapter-0.4.1-3.5.noarch.rpm"
RPM_HASH = "27a9bed0cbb2e84959085a0e3536593da227b29d4c683754a489678606c410b9aa284152fd32c7a573fdcc09dddab2e92fed2e33a4e819005b1f68bdcfe04c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-wsgi-adapter \
python3.13dist-requests-wsgi-adapter \
python313-requests-wsgi-adapter \
python3dist-requests-wsgi-adapter"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
