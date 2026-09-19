SUMMARY = "Utility that helps with local TCP ports managment"
DESCRIPTION = "port-for is a command-line utility and a python library that \
helps with local TCP ports management. \
 \
It can find an unused TCP localhost port and remember the association:: \
 \
    $ sudo port-for foo \
    37987 \
 \
This can be useful when you are installing a stack of software \
with multiple parts needing port numbers. \
 \
There are several rules port-for is trying to follow to find and \
return a new unused port: \
 \
1) Port must be unused: port-for checks this by trying to connect \
   to the port and to bind to it. \
 \
2) Port must be IANA unassigned and otherwise not well-known: \
   this is acheived by maintaining unassigned ports list \
   (parsed from IANA and Wikipedia). \
 \
3) Port shouldn't be inside ephemeral port range. \
   This is important because ports from ephemeral port range can \
   be assigned temporary by OS (e.g. by machine's IP stack) and \
   this may prevent service restart in some circumstances. \
   ``port-for`` doesn't return ports from ephemeral port ranges \
   configured at the current machine. \
 \
4) Other heuristics are also applied: ``port-for`` tries to return \
   a port from larger port ranges; it also doesn't return ports that are \
   too close to well-known ports."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-port-for-1.0.0-1.4.noarch.rpm"
RPM_HASH = "03952b14befdb0f37405a634a6fe799f48a6d9aab1673177a96c112a64948a87bac840134766672b8f19189630cb8617eb9840dd2691c1a8cd02fb0a67920a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-port-for \
python314-port-for \
python3dist-port-for"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
