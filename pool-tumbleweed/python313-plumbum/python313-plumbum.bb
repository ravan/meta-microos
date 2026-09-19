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

RPM_NAME = "python313-plumbum-2.0.1-1.3.noarch.rpm"
RPM_HASH = "1efb3cf18924d2dd10432e3797fb2fa8da5982ce16d03b8a41e21b57723b535112a093c009e2c15698811d9a68d126e17481d7052eb6257c83c07d98b58ad8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plumbum \
python3.13dist-plumbum \
python313-plumbum \
python3dist-plumbum"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
