SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python314-betamax-matchers-0.4.0-2.5.noarch.rpm"
RPM_HASH = "7ce7f72909b04acbf1641fec7d95004be5d6362397350e72e173a8389bec99d3d970fdbc536a76c47d4ba8e017f3903b18fd1caa9717fccc8f66a92c7a62c271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-betamax-matchers \
python314-betamax-matchers \
python3dist-betamax-matchers"

RDEPENDS:${PN} += "python-abi \
python314-betamax \
python314-requests-toolbelt"

inherit rpm
