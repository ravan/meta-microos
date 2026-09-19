SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-untokenize-0.1.1-4.4.noarch.rpm"
RPM_HASH = "96b057972c8ee03787e6421728e074652661b1ac58932940778c304dc45237da83b23463b723e98ccaa14e06a38d26a1706e6b75c76845e1c58b3574dade9eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-untokenize \
python3.13dist-untokenize \
python313-untokenize \
python3dist-untokenize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
