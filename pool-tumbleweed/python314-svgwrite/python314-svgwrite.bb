SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python314-svgwrite-1.4.3-3.5.noarch.rpm"
RPM_HASH = "60078f594b1c57bc296561cbd3c595dbe0755cdb54d43ca89795c41abb688555bd1cc06b91f73c4ee23c095b13e1e7aef023cdc63a80fbbdda059779f99a6e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-svgwrite \
python314-svgwrite \
python3dist-svgwrite"

RDEPENDS:${PN} += "python-abi \
python314-pyparsing"

inherit rpm
