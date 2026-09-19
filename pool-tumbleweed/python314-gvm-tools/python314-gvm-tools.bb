SUMMARY = "Tools to control a GSM/GVM over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Tools gvm-tools are a collection \
of tools that help with remote controlling a Greenbone Security Manager \
(GSM) appliance and its underlying Greenbone Vulnerability Manager (GVM). \
The tools aid in accessing the communication protocols GMP (Greenbone \
Management Protocol) and OSP (Open Scanner Protocol). \
 \
This module is comprised of interactive and non-interactive clients. \
The programming language Python is supported directly for interactive \
scripting. But it is also possible to issue remote GMP/OSP commands \
without programming in Python."
LICENSE = "GPL-3.0-or-later"

PV = "25.4.9"

RPM_NAME = "python314-gvm-tools-25.4.9-1.3.noarch.rpm"
RPM_HASH = "a2b3145bd1fc53fa50f014e7583f455f1fbca5dc5289750c8239a65212aa202ad8212382fc6d2de1686ad0ff24982038b76185f5acfe0a5bf8d70806d8a50f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gvm-tools \
python314-gvm-tools \
python3dist-gvm-tools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-python-gvm \
update-alternatives"

inherit rpm
