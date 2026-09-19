SUMMARY = "Sphinx DocumentedList extension"
DESCRIPTION = "Sphinx extension to convert a Python list into a table in the generated \
documentation. The intended application of this extension is to document \
the items of essentially list-like objects of immutable data (possibly \
enums, though python 3.4 enums are not supported yet). \
 \
In the source code, each list item, instead of being just its native \
data type, should be replaced by a tuple of two elements. In the \
simplest application, the second element of the tuple should be a string \
providing a description for the item."
LICENSE = "BSD-2-Clause"

PV = "0.6"

RPM_NAME = "python314-sphinxcontrib-documentedlist-0.6-4.5.noarch.rpm"
RPM_HASH = "d22a79084e773c0b22e2ccc45cf7279b18d794545213f6e7a39997e821d9a66235cf1cb65e1452b9a3cfe5e59d1740c00e85e639a84dee18505c699bfd6944c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-documentedlist \
python314-sphinxcontrib-documentedlist \
python3dist-sphinxcontrib-documentedlist"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-six"

inherit rpm
