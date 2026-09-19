SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python314-pydata-google-auth-1.9.1-1.5.noarch.rpm"
RPM_HASH = "78a389f047b50ba9bb262dc4666a82cdbee99d459f06529e37cfd686ce630f825a3bad62e62c4d7da1cc70e98bed328710677db8e9558321e2d9946b504eeb62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydata-google-auth \
python314-pydata-google-auth \
python3dist-pydata-google-auth"

RDEPENDS:${PN} += "python-abi \
python314-google-auth \
python314-google-auth-oauthlib \
python314-setuptools"

inherit rpm
