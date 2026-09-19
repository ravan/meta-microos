SUMMARY = "Library for effortlessly building pretty command line interfaces"
DESCRIPTION = "A Python library for effortlessly building pretty command line interfaces."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-questionary-2.1.1-1.5.noarch.rpm"
RPM_HASH = "31fe0f1a80c1d18230d0fb0710c31bbf2d98d33b2cb7a841199e735b63794e0d76d8c3c1b9e552436c79c310db4126cbecae243755783bf55162a26bbd6b8985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-questionary \
python3.13dist-questionary \
python313-questionary \
python3dist-questionary"

RDEPENDS:${PN} += "python-abi \
python3-prompt-toolkit"

inherit rpm
