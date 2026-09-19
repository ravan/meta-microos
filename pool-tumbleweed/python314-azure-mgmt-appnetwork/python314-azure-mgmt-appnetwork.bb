SUMMARY = "Microsoft Azure Appnetwork Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Appnetwork Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-appnetwork-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "bfbca438457b13a8f7aca488d082742767bf5b0af5800d26b2152ea69dcb87e7cf039ac78e0b80a62b7addaa235b1b9205618d1b8d2bb43fa4bb81347ff4143f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-appnetwork \
python314-azure-mgmt-appnetwork \
python3dist-azure-mgmt-appnetwork"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
