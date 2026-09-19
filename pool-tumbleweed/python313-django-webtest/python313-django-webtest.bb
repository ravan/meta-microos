SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.14"

RPM_NAME = "python313-django-webtest-1.9.14-1.3.noarch.rpm"
RPM_HASH = "a69ed9ae07e7e6904242dc88e69404787c2b962bd983982fad829f59e2927644bab7220d6d1a76f04063737645177e69c14cc6e4fbe85dc3193ddb0487cd7101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-webtest \
python3.13dist-django-webtest \
python313-django-webtest \
python3dist-django-webtest"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-WebTest"

inherit rpm
