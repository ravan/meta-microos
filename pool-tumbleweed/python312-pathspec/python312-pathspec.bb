SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python312-pathspec-1.1.1-1.3.noarch.rpm"
RPM_HASH = "1ec44a7f37f704c065c62b6b0d6aac345e203637e7db59f6cf2695d90d183dc24dfd5e30fedeb6ec63b41818dffe4fb3f9758036fd5d31b8ae4b98ec9d1b0af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-pathspec \
python312-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
