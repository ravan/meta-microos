SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python313-pathspec-1.1.1-1.3.noarch.rpm"
RPM_HASH = "99aa7595e4d2be0fe4c0cf601966d2c5d70798a92b401c612a54b478fb69a58ea161fb44999a0d4a9d05fe86b48f7d40cb70b4c66641ad9f8d5d1120f1a2bafa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathspec \
python3.13dist-pathspec \
python313-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
