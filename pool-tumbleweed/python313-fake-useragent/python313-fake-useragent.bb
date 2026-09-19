SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python313-fake-useragent-2.2.0-1.5.noarch.rpm"
RPM_HASH = "e29d4b07b3b799b46dfb70b3b355fa9d1ee72e62239b63b0aa8cc40cf9db0649bb0fda960386f7b28cc40044f5100cdd34da5ad45c6062b05fc50c02cae3381c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-useragent \
python3.13dist-fake-useragent \
python313-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
