SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python313-django-appconf-1.2.0-1.4.noarch.rpm"
RPM_HASH = "b02afb07c9ce4cf2d182ecd4628f7f64c2c544507a66eb996d77861c605aa57982147b698113506f43b71a71d8b6e6073140cab03ac36c0d2bb0ca20479d7bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-appconf \
python3.13dist-django-appconf \
python313-django-appconf \
python3dist-django-appconf"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
