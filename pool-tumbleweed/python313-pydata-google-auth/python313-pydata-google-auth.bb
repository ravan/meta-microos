SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python313-pydata-google-auth-1.9.1-1.5.noarch.rpm"
RPM_HASH = "ecbbf5c96d235158e79e4a74d756b4d2f992f4cf9d5f5adebe84a87330981b23a99b1f2e95bac22d1cf0a80042e865257ee854e0be4ed94a403d39e01081918f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydata-google-auth \
python3.13dist-pydata-google-auth \
python313-pydata-google-auth \
python3dist-pydata-google-auth"

RDEPENDS:${PN} += "python-abi \
python313-google-auth \
python313-google-auth-oauthlib \
python313-setuptools"

inherit rpm
