SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python313-azure-common-1.1.28-3.9.noarch.rpm"
RPM_HASH = "556302f55017077afe94b8431a1552d7b2b4eb4bc311bb67fce43238c31c0f287f9c4d256c475d23f4df869f9bcda429f217ef179b6abd3a9905882a84416eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-common \
python3.13dist-azure-common \
python313-azure-common \
python3dist-azure-common"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
