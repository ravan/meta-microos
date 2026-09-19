SUMMARY = "Microsoft Azure HDInsight Management Client Library"
DESCRIPTION = "This is the Microsoft Azure HDInsight Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.1.0~b2"

RPM_NAME = "python314-azure-mgmt-hdinsight-9.1.0~b2-1.4.noarch.rpm"
RPM_HASH = "d835d840913960e4dffc677292056b2d99fb84eff817856f678fca62076b0309e3705459ae9e118f174a8452aaf5aa94aa02fd29255894aba92f070da5fb4086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hdinsight \
python314-azure-mgmt-hdinsight \
python3dist-azure-mgmt-hdinsight"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.7.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
