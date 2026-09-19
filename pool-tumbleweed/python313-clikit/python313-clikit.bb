SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python313-clikit-0.6.2-3.11.noarch.rpm"
RPM_HASH = "01f8956901257e1bc988b2213618fef486cf87b88fcf9a1a14819aea28927b79d41e0ff516b0a2d0a1b27aa9dc1c149b40f3dda5e347333716e6dab412a14644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clikit \
python3.13dist-clikit \
python313-clikit \
python3dist-clikit"

RDEPENDS:${PN} += "python-abi \
python313-crashtest \
python313-pastel \
python313-pylev"

inherit rpm
