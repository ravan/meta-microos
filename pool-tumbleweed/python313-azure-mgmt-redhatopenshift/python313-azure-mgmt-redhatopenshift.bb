SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-azure-mgmt-redhatopenshift-4.0.0-1.1.noarch.rpm"
RPM_HASH = "482601e209c87abfdbdc885bfda3fb2d57d658f6b77020a10ebadd748bc905eb208fac6fd42bc61f576dda91e2f60418b1822399f3679a4e0e2beedf62635ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redhatopenshift \
python3.13dist-azure-mgmt-redhatopenshift \
python313-azure-mgmt-redhatopenshift \
python3dist-azure-mgmt-redhatopenshift"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
