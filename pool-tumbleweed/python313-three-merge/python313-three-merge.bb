SUMMARY = "Simple library for merging two strings with respect to a base one"
DESCRIPTION = "Simple Python library to perform a 3-way merge between strings, based on \
diff-match-patch. This library performs merges at a character level, as \
opposed to most VCS systems, which opt for a line-based approach."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-three-merge-0.1.1-2.5.noarch.rpm"
RPM_HASH = "7af56ef248bccabd2001d7512456d7ab624c7c4e798d5eda72e1dff7945dd73bf4c69ede171e89e307e8d5e7fa33a7e55e03fd2b1f374a171ba5f6f143a2da62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-three-merge \
python3.13dist-three-merge \
python313-three-merge \
python3dist-three-merge"

RDEPENDS:${PN} += "python-abi \
python313-diff-match-patch"

inherit rpm
