SUMMARY = "DataDiff is a library to provide human-readable diffs of python data structures"
DESCRIPTION = "DataDiff is a library to provide human-readable diffs of python data structures. \
It can handle sequence types (lists, tuples, etc), sets, and dictionaries. \
Dictionaries and sequences will be diffed recursively, when applicable. \
It has special-case handling for multi-line strings, showing them as a typical unified diff. \
Drop-in replacements for some nose assertions are available.  If the assertion fails, \
a nice data diff is shown, letting you easily pinpoint the root difference."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python313-datadiff-2.2.0-4.12.noarch.rpm"
RPM_HASH = "545c7b8f9851fde23c58592d91cae2e7fbfb897eebd09dc87730f28a8752c6cea3eaf8fbf8cfa2d4309515ccd73dd0872ba514f51ee64e6e530fbe6e32c50ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-datadiff \
python3.13dist-datadiff \
python313-datadiff \
python3dist-datadiff"

RDEPENDS:${PN} += "python-abi"

inherit rpm
