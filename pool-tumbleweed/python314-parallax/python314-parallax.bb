SUMMARY = "Python module for multi-node SSH command execution and file copy"
DESCRIPTION = "Parallax SSH provides an interface to executing commands on multiple \
nodes at once using SSH. It also provides commands for sending and receiving files to \
multiple nodes using SCP."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "python314-parallax-1.0.8-5.2.noarch.rpm"
RPM_HASH = "5967a9d3733d6981b3f6370acd8b1ea2cd3030d7e988e217908d957e6d2a1494f4f0bb916f5ec1c4e515063bf3926891026b1d35f6140abd1fc258aacce5828a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parallax \
python314-parallax \
python3dist-parallax"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
openssh \
python-abi"

inherit rpm
