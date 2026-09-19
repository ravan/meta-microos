SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "python-kiwi-keg-2.2.1-1.3.noarch.rpm"
RPM_HASH = "48e69d238f303175016ed8d74e916d48f812a201ac7264cb293f85c682537dde13957b6f98deabcc5eb3f9c953188d5984ae0d0de34443caab2dbb51b7c3f2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-kiwi-keg \
python3.13dist-kiwi-keg \
python3dist-kiwi-keg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-Jinja2 \
python313-PyYAML \
python313-docopt \
python313-kiwi \
python313-schema"

inherit rpm
