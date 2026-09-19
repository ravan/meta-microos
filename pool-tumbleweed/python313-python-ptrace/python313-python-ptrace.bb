SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.9"

RPM_NAME = "python313-python-ptrace-0.9.9-1.4.noarch.rpm"
RPM_HASH = "8a82f8e44766001e241e3ff4f86173f0e9b5f3c4c30b13e52914e4f09c1f4b60fcb6682efacee233dfc797ea5c9359f98dd2dfc8183945ba952a364f2af79083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-ptrace \
python3.13dist-python-ptrace \
python313-python-ptrace \
python3dist-python-ptrace"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
