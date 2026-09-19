SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python313-termstyle-0.1.11-8.5.noarch.rpm"
RPM_HASH = "41cb3921f9df05cdfb17588a568a2d2dcee8ee885f4920eb6d6106dc8da07949469e73021a990fa5b2e5931047981e11402955d453490defbad6b69da7ee3d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-termstyle \
python3-termstyle \
python3.13dist-termstyle \
python313-python-termstyle \
python313-termstyle \
python3dist-termstyle"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
