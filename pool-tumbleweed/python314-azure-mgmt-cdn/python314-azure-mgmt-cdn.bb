SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.0.0"

RPM_NAME = "python314-azure-mgmt-cdn-14.0.0-1.1.noarch.rpm"
RPM_HASH = "47800c5bf6d1d7e8561b75cbf16eaa460680cfefc0a3cf50843d90668caff7a00d8ad55a75f436159e7ff4f7be248cdfdd97756079ad133157e5cadb0e27bce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-cdn \
python314-azure-mgmt-cdn \
python3dist-azure-mgmt-cdn"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
