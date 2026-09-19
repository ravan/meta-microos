SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python314-authheaders-0.16.3-1.8.noarch.rpm"
RPM_HASH = "dbbd3d758563bd4e9ad82a3441c455a7c4c7004e8df927cb3fbb131e15546a36af466e8d12a4184480b1b865f5137d7bd458aeeafaa0ea71b90ca5ae12e6757c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-authheaders \
python314-authheaders \
python3dist-authheaders"

RDEPENDS:${PN} += "python-abi \
python314-authres \
python314-dkimpy \
python314-dnspython \
python314-publicsuffix2"

inherit rpm
