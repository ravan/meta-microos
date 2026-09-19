SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python314-unicodecsv-0.14.1-3.5.noarch.rpm"
RPM_HASH = "4d2dd454dd95d929b7afaa895a7f2cc0f39aa316b7dcc45c452133ef6459c1aaca91c8de345fbc6d74c37939f4e564cea979d77f4ede2981439af75664da1e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unicodecsv \
python314-unicodecsv \
python3dist-unicodecsv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
