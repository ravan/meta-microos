SUMMARY = "Python module for pysol-cards"
DESCRIPTION = "This module allows the python developer to generate the initial deals of some \
PySol FC games. It also supports PySol legacy deals and Microsoft FreeCell / \
Freecell Pro deals."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "python314-pysol-cards-0.24.0-1.4.noarch.rpm"
RPM_HASH = "af6d3feca2a2ef677e105da134c03f3546d385c455d26359af7098190caa62c64022568c54df3377125fd04e5ec4f37878300f1ed2a08611de0cd9333988b63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysol-cards \
python314-pysol-cards \
python3dist-pysol-cards"

RDEPENDS:${PN} += "python-abi \
python314-random2"

inherit rpm
