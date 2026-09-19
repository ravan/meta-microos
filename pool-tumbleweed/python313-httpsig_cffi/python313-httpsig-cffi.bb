SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python313-httpsig_cffi-15.0.0-4.5.noarch.rpm"
RPM_HASH = "e148e6c6bd104be63589700d5b480cc0aad9858cf385b2e6314fc42edf58743b670230ea157d556a643f967181863b09db48ab317d2d91e09535d76a3e493e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpsig-cffi \
python3.13dist-httpsig-cffi \
python313-httpsig-cffi \
python3dist-httpsig-cffi"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-requests \
python313-six"

inherit rpm
