SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python314-httpsig_cffi-15.0.0-4.5.noarch.rpm"
RPM_HASH = "048017d707715253688a56c9d61684904c93afd1dcf00f29739da86950a970f922e8e1a8a1852b8f563b0fd52cb412e82503a301bdf2870cf83f3d4fd519a64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpsig-cffi \
python314-httpsig-cffi \
python3dist-httpsig-cffi"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-requests \
python314-six"

inherit rpm
