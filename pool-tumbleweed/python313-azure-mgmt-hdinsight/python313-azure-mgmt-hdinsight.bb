SUMMARY = "Microsoft Azure HDInsight Management Client Library"
DESCRIPTION = "This is the Microsoft Azure HDInsight Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.1.0~b2"

RPM_NAME = "python313-azure-mgmt-hdinsight-9.1.0~b2-1.4.noarch.rpm"
RPM_HASH = "22bc8101ff711ab35a36948cd60ad3287c9b1d720a284acef94a3363dfa94d23ff1b6a43eeeffc65196d9e8fd60224e4dd8cd63c06d3eb093cd8fab120ef3151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hdinsight \
python3.13dist-azure-mgmt-hdinsight \
python313-azure-mgmt-hdinsight \
python3dist-azure-mgmt-hdinsight"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.7.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
