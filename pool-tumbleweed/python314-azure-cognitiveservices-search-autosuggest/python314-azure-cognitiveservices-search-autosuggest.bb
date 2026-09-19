SUMMARY = "Microsoft Azure Auto Suggest Client Library"
DESCRIPTION = "This is the Microsoft Azure Auto Suggest Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-azure-cognitiveservices-search-autosuggest-0.2.1-1.9.noarch.rpm"
RPM_HASH = "8c6bffa3657700bb8141681ec2f8406b7b1d70e019fb90a40ec32953b0c19167f7c6597b7b33c8f11db50a09d869c4e17a81c8347cd6188aac262ccb21577213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-search-autosuggest \
python314-azure-cognitiveservices-search-autosuggest \
python3dist-azure-cognitiveservices-search-autosuggest"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.6.21 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-cognitiveservices-search-nspkg \
python314-azure-nspkg"

inherit rpm
