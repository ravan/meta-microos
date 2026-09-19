SUMMARY = "Django module to process multiple Celery task requests together"
DESCRIPTION = "An alternate way to have Django DRY forms. The developer can build \
programmatic reusable layouts out of components, having control of \
the rendered HTML without writing HTML in templates, without breaking \
the standard way of doing things in Django, so that it still works \
with any other form application."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python314-celery-batches-0.8.1-1.10.noarch.rpm"
RPM_HASH = "2cbff7797285b7f5207bebde13db6567f9b330c68bbdfbad30fea6f6c317db1761abc5507145318012509e526cd713702ef6986fb4af93db7313f7bf6f5ecbd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-celery-batches \
python314-celery-batches \
python3dist-celery-batches"

RDEPENDS:${PN} += "python-abi \
python314-celery"

inherit rpm
