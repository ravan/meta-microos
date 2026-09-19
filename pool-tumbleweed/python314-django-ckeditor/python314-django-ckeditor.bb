SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.7.3"

RPM_NAME = "python314-django-ckeditor-6.7.3-1.4.noarch.rpm"
RPM_HASH = "3a1668108d30caebac248461452b639d3fb55230f309d6c48356cbde5cd5e592bf5a0cd04eada1e01ebcb496dc9e5cd5cb6bd64ca6b833b1ea228c137d06fa55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-ckeditor \
python314-django-ckeditor \
python3dist-django-ckeditor"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-django-js-asset"

inherit rpm
