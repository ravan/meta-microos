SUMMARY = "Command Line Interface Formulation Framework"
DESCRIPTION = "Command Line Interface Formulation Framework"
LICENSE = "Apache-2.0"

PV = "4.16.0"

RPM_NAME = "python313-cliff-4.16.0-1.1.noarch.rpm"
RPM_HASH = "cb71f11556eec8649d06277269cbeb9398f1710679aa96048298146226d2db89d518845a5ca2fe75ca31a1429831896e89ad66ac63bef8f715466dca1fde64b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cliff \
python3.13dist-cliff \
python313-cliff \
python3dist-cliff"

RDEPENDS:${PN} += "python-abi \
python313-PrettyTable \
python313-PyYAML \
python313-autopage \
python313-cmd2 \
python313-stevedore"

inherit rpm
