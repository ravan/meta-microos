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

RPM_NAME = "python313-gvm-tools-25.4.9-1.3.noarch.rpm"
RPM_HASH = "33c84128ff8370cbbc978a869e0c8f56d1226bb0fe4291b031e43a31f94ddcd8e8c4ce25837100edd269bb925d235ba81b163b29ad5026407e932e3a2712233b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gvm-tools \
python3.13dist-gvm-tools \
python313-gvm-tools \
python3dist-gvm-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-python-gvm \
update-alternatives"

inherit rpm
