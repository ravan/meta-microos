SUMMARY = "Command line interface for the kernel NVMe nvmet"
DESCRIPTION = "This package contains the command line interface to the NVMe over \
Fabrics target in the Linux kernel. It allows configuring the NVMe \
target interactively as well as saving / restoring the configuration \
to / from a json file."
LICENSE = "Apache-2.0"

PV = "0.9"

RPM_NAME = "nvmetcli-0.9-1.1.noarch.rpm"
RPM_HASH = "75d6f8e50305f52e467e401a0d5aaa31762a81fb8c713e1666380881a2d39ca308975607e3fbfcc878ab09ef4df997a95cb8c2b904c71079862e80583c1e0c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvmetcli \
python3.13dist-nvmetcli \
python3dist-nvmetcli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-configshell-fb \
systemd"

inherit rpm
