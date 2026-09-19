SUMMARY = "Plugin backend renderer for reportlab.graphicsrenderPM"
DESCRIPTION = "Plugin backend renderer for reportlab.graphics.renderPM"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python314-rlPyCairo-0.4.0-1.4.noarch.rpm"
RPM_HASH = "9e311bd588e72df7a049acef9d812e863e03b1bbbc2b8154fcae1bc8e35eba0fb2213fbb02cd9c36f7e9a682616295ae25b80869f48c86e6279688a1b7ef46a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rlpycairo \
python314-rlPyCairo \
python314-rlpycairo \
python3dist-rlpycairo"

RDEPENDS:${PN} += "python-abi \
python314-freetype-py \
python314-pycairo"

inherit rpm
