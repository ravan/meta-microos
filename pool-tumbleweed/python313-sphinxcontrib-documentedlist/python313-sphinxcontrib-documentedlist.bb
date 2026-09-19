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

RPM_NAME = "python313-sphinxcontrib-documentedlist-0.6-4.5.noarch.rpm"
RPM_HASH = "d4edbd4bc140885423d282bdd5bd34b28b12190fcd221d5c4ee96192a9db19c0b36c6c47cd7ddaac92a1b6551cac022e39adc5104680970aa77c5f8b6bbc3dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-documentedlist \
python3.13dist-sphinxcontrib-documentedlist \
python313-sphinxcontrib-documentedlist \
python3dist-sphinxcontrib-documentedlist"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-six"

inherit rpm
