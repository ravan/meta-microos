SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python314-betamax-0.9.0-1.9.noarch.rpm"
RPM_HASH = "0f1e9c05301de432dbba7cdd1f4234a9d6a4c883cb7ea5251cd9571af085199bbc0f261b8df9cc4383ad531b07b890fc7a26518f01ff6ca671daeeab5dc3e643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-betamax \
python314-betamax \
python3dist-betamax"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
