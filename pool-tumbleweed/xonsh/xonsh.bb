SUMMARY = "A general purpose, Python-powered shell"
DESCRIPTION = "xonsh is a Python-powered, Unix-gazing shell language and command prompt. The language is a superset of Python 3.5+ with additional shell primitives. xonsh (pronounced conch) is meant for the daily use of experts and novices alike."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "xonsh-0.24.0-1.1.noarch.rpm"
RPM_HASH = "ee3e7328b5d3e4f5eff79849e79511a8361d00afff37640d481a5984a17a905bb3c1e2274c809d7706f32a1766f6b7d0db75ddcb7a7863e630168f147ee12208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xonsh \
python3.13dist-xonsh \
python3dist-xonsh \
xonsh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-prompt-toolkit"

inherit rpm
