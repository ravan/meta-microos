SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.18.1"

RPM_NAME = "python314-pydrive2-1.18.1-2.5.noarch.rpm"
RPM_HASH = "599c0bf19a94f3471f35629e504a919bae3238d2e8c2e44457cf3a031606a5f28372079d5aa384fba6fdd1f524f269f6d8fdb05e21b623ffcca9a295b2bb2d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydrive2 \
python314-pydrive2 \
python3dist-pydrive2"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-google-api-python-client \
python314-google-auth \
python314-google-auth-httplib2 \
python314-google-auth-oauthlib \
python314-pyOpenSSL"

inherit rpm
