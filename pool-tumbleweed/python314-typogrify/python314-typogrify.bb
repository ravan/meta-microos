SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python314-typogrify-2.1.0-1.8.noarch.rpm"
RPM_HASH = "224c4a6bdf4087c7fc8799f31c5cffa59f8a84216dd79eb2fa6b4a767d3a91d00123130b7d71975bf670d6fc3e932294b2bd132a189f95c47483be0b5f5ef9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typogrify \
python314-typogrify \
python3dist-typogrify"

RDEPENDS:${PN} += "python-abi \
python314-smartypants"

inherit rpm
