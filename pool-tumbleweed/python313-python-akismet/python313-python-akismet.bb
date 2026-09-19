SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python313-python-akismet-0.4.3-2.5.noarch.rpm"
RPM_HASH = "be94a4eb281e503ac971adbd0ec90f12b0373ef81194daa50c5da2c24ddb5ad215de73095712c5003837c5b532a5686deefece9212648e974b308d4e9c41aad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-akismet \
python3.13dist-python-akismet \
python313-python-akismet \
python3dist-python-akismet"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
