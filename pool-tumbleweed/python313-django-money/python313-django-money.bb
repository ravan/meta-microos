SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.6.1"

RPM_NAME = "python313-django-money-3.6.1-1.1.noarch.rpm"
RPM_HASH = "91afeee6be68f03d4763a5c4582d0caa391f2e2d82e26fefba2f522861a57ecf0f06b381aa7e4f751d7f5c54c219167d3b0d088fc5d254e18b844929523a5f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-money \
python3.13dist-django-money \
python313-django-money \
python3dist-django-money"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-py-moneyed \
python313-setuptools"

inherit rpm
