SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python314-azure-communication-identity-1.5.0-2.9.noarch.rpm"
RPM_HASH = "e169a9033c675ce3a3ae3f40464a0e664eaf2f2955867361f7f1e98e13ec1e6d9951455931fcdf502b2156c9094d56772708bfae31253da48d7f1ba7fe36994c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-identity \
python314-azure-communication-identity \
python3dist-azure-communication-identity"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
