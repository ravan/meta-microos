SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python314-Protego-0.6.2-1.2.noarch.rpm"
RPM_HASH = "bf5c0e6ea52ca399aff8ac409885d39141e240f22cd3e4db51a52b3f7e58c7c3efcd1f43f36fe8a0b80f0c696b15c9405d6baff4dd100945463423ef5f9a1542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-protego \
python314-Protego \
python3dist-protego"

RDEPENDS:${PN} += "python-abi"

inherit rpm
