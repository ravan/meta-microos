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

RPM_NAME = "python314-XStatic-term.js-0.0.7.0-2.5.aarch64.rpm"
RPM_HASH = "b6cf6f385df528d098f807a4293cf89f3a13b7f2d92257da3b88122971d461bdd178b01a31d0c477e8783f32f98545b26e89d80d8ef194f392da824dabcfe312"

RPROVIDES:${PN} += "python3.14dist-xstatic-term.js \
python314-XStatic-term.js \
python3dist-xstatic-term.js"

RDEPENDS:${PN} += "python-abi"

inherit rpm
