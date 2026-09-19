SUMMARY = "Backport of CPython tarfile module"
DESCRIPTION = "Backport of CPython tarfile module"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-backports.tarfile-1.2.0-1.4.noarch.rpm"
RPM_HASH = "617ea453154d7a935767e232d057ff268e0a5e1cf9cacdb0cf51234d69185f50008340133ac8e5694ed182296ff28bacc8e13569cd5c6840707e99621880c391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backports.tarfile \
python3.13dist-backports.tarfile \
python313-backports.tarfile \
python3dist-backports.tarfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
