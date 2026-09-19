SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.31.0"

RPM_NAME = "python313-django-perf-rec-4.31.0-1.4.noarch.rpm"
RPM_HASH = "197d141634a890f487f799709764b00063d0809cffb1fa516852ddf48c856e29156149dc58e1ee1a44833eaea03f26a4b504bbbb6f444e36353c55320fc3203f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-perf-rec \
python3.13dist-django-perf-rec \
python313-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-PyYAML \
python313-sqlparse"

inherit rpm
