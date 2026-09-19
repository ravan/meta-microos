SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python314-requests-file-3.0.1-1.2.noarch.rpm"
RPM_HASH = "96a7395d9bf20a4697b3d0393b1b6bcc714eb4e22661dde14f9f520ccb6fac48cc66f4f6b70e33452f46100274967ab0c984cb766d0ec4bb9ce13137eddde122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-file \
python314-requests-file \
python3dist-requests-file"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
