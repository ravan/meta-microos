SUMMARY = "Microsoft Azure Kubernetesconfiguration-extensiontypes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Kubernetesconfiguration-extensiontypes Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-kubernetesconfiguration-extensiontypes-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "ad1829a57777d7ed05e9ea831ffb10b5852e11ea67b2bc49186f2d39f6fab868a64217c78dc09f805fa44aa213d00a437cefbe95daa48af3848bb6ab47cf8041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-kubernetesconfiguration-extensiontypes \
python314-azure-mgmt-kubernetesconfiguration-extensiontypes \
python3dist-azure-mgmt-kubernetesconfiguration-extensiontypes"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-kubernetesconfiguration \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
