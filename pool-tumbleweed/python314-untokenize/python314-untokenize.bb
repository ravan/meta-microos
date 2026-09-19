SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-untokenize-0.1.1-4.4.noarch.rpm"
RPM_HASH = "bc3658c6954f68959f002ce3ee90d04c6a7db8a3f0fd3f7f47eee72b378d2772017c8fe4a7b20fc3ef8aaf37a25af75f49a4723b7485624d24d9d3b7c7bf380e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-untokenize \
python314-untokenize \
python3dist-untokenize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
