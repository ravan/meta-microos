SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python313-linstor-client-1.12.0-3.2.noarch.rpm"
RPM_HASH = "41cdaf1a9ceb9af68998df1195bc25d36ef2c15fd2e96e45d57b41a90372e1bff10ce2feabe7eb530a6066358bd7e7dad0a9b70416a95b6aee5c81cb0976de14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linstor-client \
python3.13dist-linstor-client \
python313-linstor-client \
python3dist-linstor-client"

RDEPENDS:${PN} += "python-abi \
python313-linstor"

inherit rpm
