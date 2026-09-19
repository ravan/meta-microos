SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python313-parallax-1.0.8-5.2.noarch.rpm"
RPM_HASH = "d0118f0a449a963a1149770ee9c7ef1f9669dbb29a9f816291fb9e6da007de8c1421d24f51a169eba1290b0b18622edff9799f8c50fdb3d2c4841d0b0eff965b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parallax \
python3.13dist-parallax \
python313-parallax \
python3dist-parallax"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
openssh \
python-abi"

inherit rpm
