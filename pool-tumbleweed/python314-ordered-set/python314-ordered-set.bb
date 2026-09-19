SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-ordered-set-4.1.0-3.12.noarch.rpm"
RPM_HASH = "793aeed8fa02b4ec16d8f711220bce4ddaa6c0dd5d55dff87ca39f1a1e633aaf26c6b89ea6f71092ef4d6590fac0af9b150441ec57b57cc0fb7e8283d2128cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ordered-set \
python314-ordered-set \
python3dist-ordered-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
