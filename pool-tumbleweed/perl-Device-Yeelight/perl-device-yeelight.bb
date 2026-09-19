SUMMARY = "Controller for Yeelight smart devices"
DESCRIPTION = "Controller for Yeelight smart devices"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.140.0"

RPM_NAME = "perl-Device-Yeelight-0.140.0-1.10.noarch.rpm"
RPM_HASH = "b5ed2cf96ef0371b6409f9068b79bda91b350d12e03aa3f02168917658791ed4ffe3d42511885b16be6404d4dc712edd08c10cf77558ae7f41bfcbf005c237e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Device--Yeelight \
perl-Device--Yeelight--Light \
perl-Device-Yeelight"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO \
perl-IO--Socket--Multicast \
perl-JSON"

inherit rpm
