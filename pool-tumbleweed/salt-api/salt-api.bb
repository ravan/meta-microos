SUMMARY = "The api for Salt a parallel remote execution system"
DESCRIPTION = "salt-api is a modular interface on top of Salt that can provide a variety of entry points into a running Salt system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-api-3006.0-70.1.aarch64.rpm"
RPM_HASH = "15619427ab14d59a79fd7b289b67801105f17a74bab180ca1473ce522c42b38fd089501971afa3059f02a250c18f671f07a801ae65f6114903b7e9ffdfbba127"

RPROVIDES:${PN} += "salt-api"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-CherryPy \
salt \
salt-master"

inherit rpm
