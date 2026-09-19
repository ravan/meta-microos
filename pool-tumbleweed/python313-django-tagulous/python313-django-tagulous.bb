SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python313-django-tagulous-2.1.1-1.3.noarch.rpm"
RPM_HASH = "73ff7e7f2f4318dbdf03009ff9c8b6445f223e1df2543df6b55fd3891acfa1e4888f8bed73ddc7e6810c93c7f1e92b01906da29e101168d4ab1dac56ae6264db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tagulous \
python3.13dist-django-tagulous \
python313-django-tagulous \
python3dist-django-tagulous"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
