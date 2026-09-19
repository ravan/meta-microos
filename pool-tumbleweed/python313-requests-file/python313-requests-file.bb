SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python313-requests-file-3.0.1-1.2.noarch.rpm"
RPM_HASH = "103edf70e88b810a39416b7a42a360d25e3bec74ecbe669d6d394685cb622ab8c2081fc9ee468772f3febc441bad8bcb18a3b348b40f16318de228550b9f2832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-file \
python3.13dist-requests-file \
python313-requests-file \
python3dist-requests-file"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
