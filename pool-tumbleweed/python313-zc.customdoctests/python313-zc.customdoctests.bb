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

RPM_NAME = "python313-zc.customdoctests-1.0.1-6.1.noarch.rpm"
RPM_HASH = "accac92343d1217d3b7073adb0fd29c36dfe4b10e8322de648dc6504021ad66e1af7c6d96a229c7aef78aaffe022641a1c19b7b6061a49caf57a07ac2aeaaf85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc.customdoctests \
python3.13dist-zc.customdoctests \
python313-zc.customdoctests \
python3dist-zc.customdoctests"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
