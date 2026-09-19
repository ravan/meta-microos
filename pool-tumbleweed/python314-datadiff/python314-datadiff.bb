SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python314-datadiff-2.2.0-4.12.noarch.rpm"
RPM_HASH = "50737bc3bf7faa300bdc8d80e39d490ac1d9b435b83c1566a9c7fc1f112c3add43c51b87a3ca9301e8c115950aa3634b8d3590422f0135241ec69559d3202073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-datadiff \
python314-datadiff \
python3dist-datadiff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
