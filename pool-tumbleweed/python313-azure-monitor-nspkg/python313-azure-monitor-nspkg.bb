SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-monitor-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "6d994b8548e701a04aeab8d303591062ed1555266152edf3cd725eff0bfd5c4062e9604db07d1fcab74c0e047a27a2db5eb6266980aaaabf827bb75ed46434b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-nspkg \
python3.13dist-azure-monitor-nspkg \
python313-azure-monitor-nspkg \
python3dist-azure-monitor-nspkg"

RDEPENDS:${PN} += "python313-azure-nspkg"

inherit rpm
