SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-azure-mgmt-redhatopenshift-4.0.0-1.1.noarch.rpm"
RPM_HASH = "b671b37ad3fa1140daeceb8f51b09c5cd658746bd657a43b126013be0e5c6ddc95327e8db6e428c89f1817847f2adbcf1ad4deb040a5c9816d3156d622e0b959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-redhatopenshift \
python314-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
