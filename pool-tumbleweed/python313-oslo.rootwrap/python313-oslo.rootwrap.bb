SUMMARY = "Filtering shell commands to run as root from OpenStack services"
DESCRIPTION = "oslo.rootwrap allows fine-grained filtering of shell commands to run as root \
from OpenStack services."
LICENSE = "Apache-2.0"

PV = "7.10.0"

RPM_NAME = "python313-oslo.rootwrap-7.10.0-1.1.noarch.rpm"
RPM_HASH = "65ed84cfa8f8094b8188ce1a3a62b6a91c8cbde157929c97e7eb8fd8151bd262e7b5891bffb55bdd10e4016c28b4436c35fc65e9a80317066800dd0c8a7c2baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.rootwrap \
python3.13dist-oslo.rootwrap \
python313-oslo.rootwrap \
python3dist-oslo.rootwrap"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
