SUMMARY = "A web interface to access GNU Mailman v3 archives"
DESCRIPTION = "A web interface to access GNU Mailman v3 archives."
LICENSE = "GPL-3.0-only"

PV = "1.3.12"

RPM_NAME = "HyperKitty-1.3.12-7.1.noarch.rpm"
RPM_HASH = "77f4d7038bf3501c7d28806a74e2770ac6d25e370e95d48dcfe25e6377c152e38aa2cfe726b225ed81481eda26dc32ce53602929950b269faaaf8f693402ea50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty \
python3.13dist-hyperkitty \
python313-HyperKitty \
python3dist-hyperkitty"

RDEPENDS:${PN} += "-python313-Django >= 4.2 with python313-Django < 5.3 \
/usr/bin/env \
/usr/bin/python3 \
python-abi \
python313-django-compressor \
python313-django-debug-toolbar \
python313-django-extensions \
python313-django-gravatar2 \
python313-django-haystack \
python313-django-mailman3 \
python313-django-q \
python313-djangorestframework \
python313-flufl.lock \
python313-mailmanclient \
python313-mistune \
python313-networkx \
python313-python-dateutil \
python313-robot-detection \
python313-xapian-haystack \
sassc"

inherit rpm
