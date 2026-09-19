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

RPM_NAME = "python314-webcolors-25.10.0-1.4.noarch.rpm"
RPM_HASH = "e49f1ef917012713b3fa3bcc28cbc2dbe674fdde73e6d951b2db64aeced43f347cc763cab240a8794f17dc300d736565aa517743c5d67ba9f8e3143a18e7680e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-webcolors \
python314-webcolors \
python3dist-webcolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
