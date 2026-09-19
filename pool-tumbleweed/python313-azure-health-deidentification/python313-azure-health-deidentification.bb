SUMMARY = "Microsoft Azure Health Deidentification Client Library for Python"
DESCRIPTION = "Python Azure Health Deidentification is a managed service that enables users to tag, \
redact, or surrogate health data."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-health-deidentification-1.0.0-1.3.noarch.rpm"
RPM_HASH = "9c944daee0ee4a95f8ca7dc9a941a6cac9910be5ee01bcb660f5d74b8cb26702edcf624379792741d1f872b3a9c13e1e7dcf2a52cf8bc1a79bdb182d6eac27c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-health-deidentification \
python3.13dist-azure-health-deidentification \
python313-azure-health-deidentification \
python3dist-azure-health-deidentification"

RDEPENDS:${PN} += "-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-core \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
