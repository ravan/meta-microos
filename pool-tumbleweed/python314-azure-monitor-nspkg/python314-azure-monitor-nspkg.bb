SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-monitor-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "be24789884fb2e88dde1f556f660a9de00513988c2f46c498879d771110365cf642c1cd81da45f694c136fc3f3c12853424cd4b9466ccb97529599f6ce29250b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-monitor-nspkg \
python314-azure-monitor-nspkg \
python3dist-azure-monitor-nspkg"

RDEPENDS:${PN} += "python314-azure-nspkg"

inherit rpm
