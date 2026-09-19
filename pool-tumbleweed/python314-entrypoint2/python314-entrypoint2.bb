SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python314-entrypoint2-1.1-3.5.noarch.rpm"
RPM_HASH = "bdb107a01d7c4c148bf5c3b47f3116b5a7a53f45d5746cbbed3f469282169fb7c460a47e8df5dcf5ba52e4d92951247ab6d5179a44f9a21b299f75f1556fe403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-entrypoint2 \
python314-entrypoint2 \
python3dist-entrypoint2"

RDEPENDS:${PN} += "python-abi \
python314-EasyProcess \
python314-decorator \
python314-path.py"

inherit rpm
