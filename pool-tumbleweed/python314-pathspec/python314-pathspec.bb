SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python314-pathspec-1.1.1-1.3.noarch.rpm"
RPM_HASH = "23ebf4a51feec5c4c702865b5180ecc0f7585d89964c19984b479e2548b0bf97d74a795b6a8838b409680261d834d06d91438ca93498155e3499cdf53bc664e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pathspec \
python314-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
