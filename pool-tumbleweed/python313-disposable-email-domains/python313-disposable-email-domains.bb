SUMMARY = "A set of disposable email domains"
DESCRIPTION = "A set of disposable email domains"
LICENSE = "MIT"

PV = "0.0.241"

RPM_NAME = "python313-disposable-email-domains-0.0.241-1.1.noarch.rpm"
RPM_HASH = "384991a07e0f06db61d7a6b2fdedb0b958a7d4de6d960d5df56b2a7235dbd38d94db77bbbd5cad68f662c7dcbec9189d0b96c5864cf98c4eeb4253160a0476a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-disposable-email-domains \
python3.13dist-disposable-email-domains \
python313-disposable-email-domains \
python3dist-disposable-email-domains"

RDEPENDS:${PN} += "python-abi"

inherit rpm
