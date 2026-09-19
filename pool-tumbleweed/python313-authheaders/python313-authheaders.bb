SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.16.3"

RPM_NAME = "python313-authheaders-0.16.3-1.8.noarch.rpm"
RPM_HASH = "5e14d087b96cecf096135b3c12f59364ec62ff235ded8611d37f5a5c96262c9892adc123fdd9b659d7f8f05220e65417e33f3d6bdbc98dfab1249fdd4f4d7296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-authheaders \
python3.13dist-authheaders \
python313-authheaders \
python3dist-authheaders"

RDEPENDS:${PN} += "python-abi \
python313-authres \
python313-dkimpy \
python313-dnspython \
python313-publicsuffix2"

inherit rpm
