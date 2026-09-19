SUMMARY = "Class based template tags for Django"
DESCRIPTION = "This project creates an altnerate way of writing Django template tags \
which is fully compatible with the current Django templating infrastructure."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-django-classy-tags-4.1.0-2.5.noarch.rpm"
RPM_HASH = "113ceefb928bdc997857431c3c2ec1f6bdbd402135422688385a609893bf040eca36d119b9f85e27ee9115862e39b34cd4d229d153d722b81c9660eb10a59f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-classy-tags \
python314-django-classy-tags \
python3dist-django-classy-tags"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
