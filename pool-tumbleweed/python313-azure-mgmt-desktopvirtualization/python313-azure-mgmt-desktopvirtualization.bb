SUMMARY = "Microsoft Azure Desktop Virtualization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Desktop Virtualization Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-desktopvirtualization-2.0.0-1.9.noarch.rpm"
RPM_HASH = "8e8a04f369cedce6f9ba3985af0ede3dfea6eea17faa775d48184cb486d94dec68dcab329f8c69c84c0c974ae10f13d76b3adb09975997f77d1f2c675230ba80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-desktopvirtualization \
python3.13dist-azure-mgmt-desktopvirtualization \
python313-azure-mgmt-desktopvirtualization \
python3dist-azure-mgmt-desktopvirtualization"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
