SUMMARY = "Shell combinators library"
DESCRIPTION = "Plumbum is a library for shell script-like programs in Python. \
 \
Apart from shell-like syntax and handy shortcuts, the library \
provides local and remote command  execution (over SSH), local and \
remote file-system paths, working-directory and environment \
manipulation, and a programmatic Command-Line Interface (CLI) \
application toolkit."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-plumbum-2.0.1-1.3.noarch.rpm"
RPM_HASH = "d382c0db32c2363d002c85165445c363940ad1ab7f2c300b5ff78dc16d6fc380103168d319fe2608091845b3edb5616b18ac975aac6ed8cfacc7c1613af0a76a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-plumbum \
python314-plumbum \
python3dist-plumbum"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
