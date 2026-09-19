SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.6.1"

RPM_NAME = "python314-cptrace-0.6.1-1.13.aarch64.rpm"
RPM_HASH = "c3e9c8ee6e186db3d00e3735e20b911fb3cb0789ee89a8d9836feb489ee82cf9eefa864d79d5c129d6a4f45fca203c9491b74c38efefcc15808893ccb9d722fe"

RPROVIDES:${PN} += "python3.14dist-cptrace \
python314-cptrace \
python3dist-cptrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
