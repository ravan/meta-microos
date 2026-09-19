SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python313-betamax-matchers-0.4.0-2.5.noarch.rpm"
RPM_HASH = "3cbafa4efe59cdd0aa005014f72a69e1f2fb2a851e5845d5383b25448db1780c224d4e437972b83a415de0556a828b4c2a0de355f5137b6bd437eef54ec43323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-betamax-matchers \
python3.13dist-betamax-matchers \
python313-betamax-matchers \
python3dist-betamax-matchers"

RDEPENDS:${PN} += "python-abi \
python313-betamax \
python313-requests-toolbelt"

inherit rpm
