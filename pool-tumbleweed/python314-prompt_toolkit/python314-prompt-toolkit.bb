SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.53"

RPM_NAME = "python314-prompt_toolkit-3.0.53-1.1.noarch.rpm"
RPM_HASH = "d68e13001304692895b06095aab0d3595ded3894c2a8bdb4703611b961f6e9e967aed7c2155ee7dfae5688aafc551a0905168f0761c7ed7fdbb07ece53fe60ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-prompt-toolkit \
python314-prompt-toolkit \
python3dist-prompt-toolkit"

RDEPENDS:${PN} += "python-abi \
python314-wcwidth"

inherit rpm
