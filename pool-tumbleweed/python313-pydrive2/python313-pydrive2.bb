SUMMARY = "A wrapper library for google-api-python-client"
DESCRIPTION = "PyDrive2 is a wrapper library of google-api-python-client that simplifies many \
common Google Drive API V2 tasks. It is an actively maintained fork of PyDrive. \
By the authors and maintainers of the Git for Data - DVC project."
LICENSE = "Apache-2.0"

PV = "1.18.1"

RPM_NAME = "python313-pydrive2-1.18.1-2.5.noarch.rpm"
RPM_HASH = "5cfa92349f42b0a420f523828ee1b631bf6add10c339fb996e5b759e4df961c3d9209c8da3ba38e0a167cc1d63f358742f7b4ddddf9df7028c64832af2da518a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydrive2 \
python3.13dist-pydrive2 \
python313-pydrive2 \
python3dist-pydrive2"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-google-api-python-client \
python313-google-auth \
python313-google-auth-httplib2 \
python313-google-auth-oauthlib \
python313-pyOpenSSL"

inherit rpm
