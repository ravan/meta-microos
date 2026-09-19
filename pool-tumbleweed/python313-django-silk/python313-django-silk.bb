SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.5.2"

RPM_NAME = "python313-django-silk-5.5.2-1.1.noarch.rpm"
RPM_HASH = "05ce9b959c868c69ebd6d3fde1cabd3bc02bfd01812f8bbf7d08cc62bb56b420692d130028f75a7049247a7780a6a32a5abb0db0861b0a1420ecbef5300064fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-silk \
python3.13dist-django-silk \
python313-django-silk \
python3dist-django-silk"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-autopep8 \
python313-gprof2dot \
python313-sqlparse"

inherit rpm
