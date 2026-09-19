SUMMARY = "Microsoft Corporation Azure Onlineexperimentation Client Library for Python"
DESCRIPTION = "This package contains Azure Online Experimentation client library for \
interacting with Microsoft.OnlineExperimentation/workspaces resources."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-onlineexperimentation-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "d881e1f183ee929e4b7798a41c5a53710c73d91304d27d55cef5a711054b488ddb0434c332cd6757dc6f74bc9710df0ee8568c85ad6f956e7cb10c43f6ff11e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-onlineexperimentation \
python314-azure-onlineexperimentation \
python3dist-azure-onlineexperimentation"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
