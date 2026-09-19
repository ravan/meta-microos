SUMMARY = "An extended implementation of JSONPath for Python"
DESCRIPTION = "This library provides a robust and significantly extended implementation \
of JSONPath for Python. It is tested with Python 2.6, 2.7, 3.2, 3.3, and PyPy. \
 \
This library differs from other JSONPath implementations in that it is a \
full *language* implementation, meaning the JSONPath expressions are \
first class objects, easy to analyze, transform, parse, print, and \
extend. (You can also execute them :-)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python314-jsonpath-rw-1.4.0-8.5.noarch.rpm"
RPM_HASH = "5c74de03c217fd40edee85627d0cab8d5aeffeb9512a895a374106706ea7909c7b1e77b02304e395a2f8f6a3fb1a5bd2533925de6fe8bd878d0bfcc153b7ade9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonpath-rw \
python314-jsonpath-rw \
python3dist-jsonpath-rw"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-decorator \
python314-ply \
python314-six"

inherit rpm
