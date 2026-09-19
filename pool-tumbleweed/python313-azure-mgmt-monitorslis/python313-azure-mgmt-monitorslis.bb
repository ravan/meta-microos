SUMMARY = "Microsoft Azure Monitorslis Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitorslis Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-monitorslis-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "039e59f34464dc8f1afd7733793fc90644b6f6105b8d51a57ff26c805687382b77555accfad996aeb49694a8a7373594bf077174050bf73b6952ad37195fbea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-monitorslis \
python3.13dist-azure-mgmt-monitorslis \
python313-azure-mgmt-monitorslis \
python3dist-azure-mgmt-monitorslis"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
