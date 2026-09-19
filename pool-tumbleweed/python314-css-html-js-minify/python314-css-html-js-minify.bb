SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python314-css-html-js-minify-2.5.5.git.1523718195.8f72452-3.5.noarch.rpm"
RPM_HASH = "45f34491f24e98c77b95e803b55999064029c5f9f6b10933d5c196e61de5c45ca4b0f24f667ba18d8a7cfd162cd9946b6aa40f10f895eb64c6b25437da02a16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-css-html-js-minify \
python314-css-html-js-minify \
python3dist-css-html-js-minify"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
