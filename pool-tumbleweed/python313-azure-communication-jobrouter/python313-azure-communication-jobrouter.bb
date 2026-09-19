SUMMARY = "Microsoft Azure Communication Job Router Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for JobRouter."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-communication-jobrouter-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "f0ce8bee2c78670b808b28e19cdd4ff6b33576d92166a64b28c527020604fcedbd6a611b0d5b16e1a4cfb14e461a49687289d021659af521767ce0f7d03a523f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-jobrouter \
python3.13dist-azure-communication-jobrouter \
python313-azure-communication-jobrouter \
python3dist-azure-communication-jobrouter"

RDEPENDS:${PN} += "-python313-azure-core >= 1.25.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-dateutil \
python313-msrest"

inherit rpm
