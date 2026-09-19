SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python313-celery-batches-0.8.1-1.10.noarch.rpm"
RPM_HASH = "04e7da1f367931b53c67e1ffd9f26db248620971b9c49f4cd0957eab42eb93b3bba39911c69e8f0ab219b2457b4f523eba5d376cb50dda4340d34cfc033a6847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery-batches \
python3.13dist-celery-batches \
python313-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python313-celery"

inherit rpm
