SUMMARY = "Use doctest with other languages"
DESCRIPTION = "doctest (and recently manuel) provide hooks for using custom doctest \
parsers.  `zc.customdoctests` helps to leverage this to support other \
languages, such as JavaScript:: \
 \
    js> function double (x) { \
    ...     return x*2; \
    ... } \
    js> double(2) \
    4 \
 \
And with `manuel <http://pypi.python.org/pypi/manuel>`_, it \
facilitates doctests that mix multiple languages, such as Python, \
JavaScript, and sh."
LICENSE = "ZPL-2.1"

PV = "1.0.1"

RPM_NAME = "python314-zc.customdoctests-1.0.1-6.1.noarch.rpm"
RPM_HASH = "56ba21b7e85fc85f7e36dd499d4e171926252fe95d62db583e4521102d20c4d03cb295463eaf5276093d09439c7f5b2bba9048ed13f6ea82dd5414016fe879d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zc.customdoctests \
python314-zc.customdoctests \
python3dist-zc.customdoctests"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
