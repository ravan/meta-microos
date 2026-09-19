SUMMARY = "AngularJS library 'term.js' repackaged for the XStatic standard"
DESCRIPTION = "term.js javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
* term.js project: `Github chjj/term.js <https://github.com/chjj/term.js>`_ \
* XStatic package: `Github takluyver/XStatic-termjs <https://github.com/takluyver/XStatic-termjs>`_ \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.0.7.0"

RPM_NAME = "python313-XStatic-term.js-0.0.7.0-2.5.aarch64.rpm"
RPM_HASH = "90949fcd3c238b795ba8334e7bcf6a257b91deab4c56b41c38c7a87f7983d1cb4337955bceef0aba7c940b5f5ddb9e35b2045226b32f6a7b7ece707f63d5af37"

RPROVIDES:${PN} += "python3-XStatic-term.js \
python3.13dist-xstatic-term.js \
python313-XStatic-term.js \
python3dist-xstatic-term.js"

RDEPENDS:${PN} += "python-abi"

inherit rpm
