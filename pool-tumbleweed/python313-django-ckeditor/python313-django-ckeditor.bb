SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.7.3"

RPM_NAME = "python313-django-ckeditor-6.7.3-1.4.noarch.rpm"
RPM_HASH = "2c89c4719bd7ff7f7b128f207aeb4d91b0be9d4b69de7bd08a79c502651ec3d92e0f73931be4b0c7a13a306f536c579cb81e9f256a4ad421819126feed2029aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-ckeditor \
python3.13dist-django-ckeditor \
python313-django-ckeditor \
python3dist-django-ckeditor"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-django-js-asset"

inherit rpm
