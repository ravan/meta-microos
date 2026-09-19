SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python314-pproxy-2.7.8-6.2.noarch.rpm"
RPM_HASH = "12c49f1c663662a9d8bb7395e62d3f4cd621d316ac85958544e0e3e74fb91af22b2918a8573f4b45a66fc4fe2bebb51ec283d8068d5b61f40df411b2c78265e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pproxy \
python314-pproxy \
python3dist-pproxy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
