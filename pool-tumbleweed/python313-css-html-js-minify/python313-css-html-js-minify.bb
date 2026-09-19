SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python313-css-html-js-minify-2.5.5.git.1523718195.8f72452-3.5.noarch.rpm"
RPM_HASH = "359ea28684b4ef01168f195bc37f0cb243d6b51aa2ceb49736d4fb5c2ef1c394ce535adff021de3345d45f953a077f83f0504a35d1a42d2ea3ed9e8eabd2c591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-css-html-js-minify \
python3.13dist-css-html-js-minify \
python313-css-html-js-minify \
python3dist-css-html-js-minify"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
