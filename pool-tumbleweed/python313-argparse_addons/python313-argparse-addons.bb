SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python313-argparse_addons-0.12.0-1.14.noarch.rpm"
RPM_HASH = "de149ad3cec0acd6568fa64181d7665742f3f82cb1a2dc30b89a117c22053e3c51c4e4bf0a401d49c40e23a2d0be1251bd5288c4735c6f2d987037e15347630f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argparse-addons \
python3.13dist-argparse-addons \
python313-argparse-addons \
python3dist-argparse-addons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
