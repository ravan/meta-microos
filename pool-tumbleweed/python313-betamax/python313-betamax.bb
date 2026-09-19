SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python313-betamax-0.9.0-1.9.noarch.rpm"
RPM_HASH = "9b34c1c5938982054032ee49391826f36731a9244644b663b605d884878f5398dce707aab7df49601250a91ea91279152e1ae0d189567fadb07ed3aed9f3a3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-betamax \
python3.13dist-betamax \
python313-betamax \
python3dist-betamax"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
