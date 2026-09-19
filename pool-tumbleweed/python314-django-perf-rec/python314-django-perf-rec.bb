SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.31.0"

RPM_NAME = "python314-django-perf-rec-4.31.0-1.4.noarch.rpm"
RPM_HASH = "5d1a9833637028a5d5a3a1f31a3baee2a4df5eb86419a10a1e41422c55fc9e289af660a6b9d04014f01fc192e6279ec0fc859f9ce08af6d4f769cab4d63f54d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-perf-rec \
python314-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-PyYAML \
python314-sqlparse"

inherit rpm
