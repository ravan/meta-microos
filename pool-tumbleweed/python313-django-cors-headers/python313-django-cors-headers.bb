SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python313-django-cors-headers-4.9.0-1.4.noarch.rpm"
RPM_HASH = "0c5e035954015fae8d1c7b85edf4808d50cf99e20e014ebb433648c528df4b16687a90642ff0d8222431f63b84e6fe337276970e936ed44418d7b9f30ea3e0d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-cors-headers \
python3.13dist-django-cors-headers \
python313-django-cors-headers \
python3dist-django-cors-headers"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
