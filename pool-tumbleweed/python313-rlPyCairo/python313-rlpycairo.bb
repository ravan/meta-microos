SUMMARY = "Plugin backend renderer for reportlab.graphicsrenderPM"
DESCRIPTION = "Plugin backend renderer for reportlab.graphics.renderPM"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python313-rlPyCairo-0.4.0-1.4.noarch.rpm"
RPM_HASH = "7017914aecfddda194fc7adad82c63843b14002b58cbdc3ba2d27befe274d5f732add89a656167fca6f46d7dc4b5b34915c101e08ee50dc6a82193694031fdf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rlPyCairo \
python3-rlpycairo \
python3.13dist-rlpycairo \
python313-rlPyCairo \
python313-rlpycairo \
python3dist-rlpycairo"

RDEPENDS:${PN} += "python-abi \
python313-freetype-py \
python313-pycairo"

inherit rpm
