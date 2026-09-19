SUMMARY = "Python 3 Developement"
LICENSE = "MIT"

PV = "20180125"

RPM_NAME = "patterns-devel-python-devel_python3-20180125-4.17.aarch64.rpm"
RPM_HASH = "789a4541b0aa27373fe7857ef0a79b58a8ce1475dd41b997beae32e525d913c36ead67de7af8ec62cb5b65f83cc2d67830fec541756c7e8c6eccd24c225b8061"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-python-devel-python3"

RDEPENDS:${PN} += ""

inherit rpm
