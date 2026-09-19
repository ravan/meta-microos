SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "15.0.0~b4"

RPM_NAME = "python314-azure-mgmt-cognitiveservices-15.0.0~b4-1.1.noarch.rpm"
RPM_HASH = "be71ba73e5f3744784668032754e2942c0005aef2d34b4499fe8ae2c4417e498017d23966b7bc3fcfa22197e96d60e158e59e7302574da2bacf55ac3ef10e241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-cognitiveservices \
python314-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
