SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python314-termstyle-0.1.11-8.5.noarch.rpm"
RPM_HASH = "725133fc06d9f1879cfaf9734ed2a0f370255e853fb833d85bf09cc175309df315f08794d7bc69299b9ec3051f1ae28a87669f81d967a9aec9e086bfcbb3b3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-termstyle \
python314-python-termstyle \
python314-termstyle \
python3dist-termstyle"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
