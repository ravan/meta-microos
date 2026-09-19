SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python313-typogrify-2.1.0-1.8.noarch.rpm"
RPM_HASH = "fb615f2eac6727619967bf46177be2ed75142532fcfa0b217d98c86498fe3fb7b0d1756d50463a7461c9c3131431d4da19075a750fcb7f871dc5745b4f063595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typogrify \
python3.13dist-typogrify \
python313-typogrify \
python3dist-typogrify"

RDEPENDS:${PN} += "python-abi \
python313-smartypants"

inherit rpm
