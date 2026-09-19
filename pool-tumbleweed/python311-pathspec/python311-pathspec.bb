SUMMARY = "Utility library for gitignore style pattern matching of file paths"
DESCRIPTION = "Pathspec is a utility library for pattern matching of file paths. So \
far this only includes Git's wildmatch pattern matching which itself is \
derived from Rsync's wildmatch. Git uses wildmatch for its `gitignore`_ \
files."
LICENSE = "MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python311-pathspec-1.1.1-1.3.noarch.rpm"
RPM_HASH = "67ade966cf64fda23f9a3ddc19193faaf465defceb4a183733a53b729406ca16d7bae14d877fbdeab20094534a9df7a4d18c34497285d27754777b96f9676d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pathspec \
python311-pathspec \
python3dist-pathspec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
