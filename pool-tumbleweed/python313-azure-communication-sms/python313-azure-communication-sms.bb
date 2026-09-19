SUMMARY = "Microsoft Azure Communication SMS Client Library for Python"
DESCRIPTION = "Azure Communication SMS client package is intended to be used to send SMS using an Azure Resource."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-communication-sms-1.1.0-1.9.noarch.rpm"
RPM_HASH = "4d4bde737c72eb6d9389153f354624b3f0933d36ea42ee6c415274db7f5742081337d75ff32788d500ee0055d18db35e2379983ce017455a485d971180b1693f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-sms \
python3.13dist-azure-communication-sms \
python313-azure-communication-sms \
python3dist-azure-communication-sms"

RDEPENDS:${PN} += "-python313-azure-core >= 1.27.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
