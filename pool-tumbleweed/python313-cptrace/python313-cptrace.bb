SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.6.1"

RPM_NAME = "python313-cptrace-0.6.1-1.13.aarch64.rpm"
RPM_HASH = "59d2f894fd542649454819411658631a9445e788fff3059271cf9fe3f6f0f5276dc618f0324ed56d5ac079529f08c27afb0fb794b9a2f828be409d9b68e16216"

RPROVIDES:${PN} += "python3-cptrace \
python3.13dist-cptrace \
python313-cptrace \
python3dist-cptrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
