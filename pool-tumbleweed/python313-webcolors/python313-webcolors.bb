SUMMARY = "Support for color names and value formats defined by the HTML"
DESCRIPTION = "Webcolors is a simple Python module for working with HTML/CSS \
color definitions. \
 \
Support is included for normalizing and converting between the \
following formats (RGB colorspace only; conversion to/from HSL can be \
handled by the ``colorsys`` module in the Python standard library): \
 \
* Specification-defined color names \
* Six-digit hexadecimal \
* Three-digit hexadecimal \
* Integer ``rgb()`` triplet \
* Percentage ``rgb()`` triplet \
 \
Implementations are also provided for the HTML5 color parsing and \
serialization algorithms. \
 \
Full documentation is `available online <http://webcolors.readthedocs.org/>`_."
LICENSE = "BSD-3-Clause"

PV = "25.10.0"

RPM_NAME = "python313-webcolors-25.10.0-1.4.noarch.rpm"
RPM_HASH = "e7ade7f6959bcebbf974282fd80cc59f2621a5804d76b1ee5e4ccb9fcd000cd8bd2b8654d828464673e4cd8a98fdeec2aec34f6b3f82c38cfd86ec94062f5684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webcolors \
python3.13dist-webcolors \
python313-webcolors \
python3dist-webcolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
