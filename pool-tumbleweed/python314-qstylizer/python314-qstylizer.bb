SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python314-qstylizer-0.2.4-1.5.noarch.rpm"
RPM_HASH = "2cc8a1152303609caa2f6e9f8deb2f445afd62bcda76123eb420ddc4f508024b3979f169639f8971b2d31b347fb9535d5f214c509d347d2608704a0651e37c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qstylizer \
python314-qstylizer \
python3dist-qstylizer"

RDEPENDS:${PN} += "python-abi \
python314-inflection \
python314-tinycss2"

inherit rpm
