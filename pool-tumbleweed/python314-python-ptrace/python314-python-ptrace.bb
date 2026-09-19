SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.9"

RPM_NAME = "python314-python-ptrace-0.9.9-1.4.noarch.rpm"
RPM_HASH = "482995630c5e7283dd6a2fe583db0760180e32a30ec18e4c38305de01be37ce0b7957c66f0e6046cb7ed6f1c6ad4bb45b4b905c8f9c3d32eae2fd923a8846b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-ptrace \
python314-python-ptrace \
python3dist-python-ptrace"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
