SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python314-flake8-polyfill-1.0.2-4.10.noarch.rpm"
RPM_HASH = "14571e9642c1da2d2af1fa5b6efb24679b5159dac38190b6bfd7f421a87e8bc6d6882713e38fdb6945eacd0931aa1521df47b81220054d84735a3296e3bf61cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-polyfill \
python314-flake8-polyfill \
python3dist-flake8-polyfill"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
