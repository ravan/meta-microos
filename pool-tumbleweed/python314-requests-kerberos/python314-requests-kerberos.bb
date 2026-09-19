SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.15.0"

RPM_NAME = "python314-requests-kerberos-0.15.0-1.9.noarch.rpm"
RPM_HASH = "05cfca72b3f2cd885cb6c7cde55ec54b25faca6b1e8326a353fb1f5fc37dae6d85214ca1f792b6e6350ebca17e56b40046c15517a9f758af97025b50b8d2cfd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-kerberos \
python314-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python314-pyspnego \
python314-requests"

inherit rpm
