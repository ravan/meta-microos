SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python313-Protego-0.6.2-1.2.noarch.rpm"
RPM_HASH = "144a0be33be2b6525c7528d11eea92e3d90da42e81a4b0dd4eed2be5f07e4a2054c66cf5326aa2ae29f2638abf81bafd976342f946cf9061b9ed942901fb33e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Protego \
python3.13dist-protego \
python313-Protego \
python3dist-protego"

RDEPENDS:${PN} += "python-abi"

inherit rpm
