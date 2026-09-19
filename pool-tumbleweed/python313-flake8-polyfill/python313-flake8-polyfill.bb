SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python313-flake8-polyfill-1.0.2-4.10.noarch.rpm"
RPM_HASH = "981f98d8d285d528e217e7899da478ef0d822f23b141cc8c1deddc29633d2766657640ab67a7f3c34eee323d28e809f3c4bb75fc19a193536dca4a27f651334b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-polyfill \
python3.13dist-flake8-polyfill \
python313-flake8-polyfill \
python3dist-flake8-polyfill"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
