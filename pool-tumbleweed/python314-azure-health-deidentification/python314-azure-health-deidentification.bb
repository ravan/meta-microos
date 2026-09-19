SUMMARY = "Microsoft Azure Health Deidentification Client Library for Python"
DESCRIPTION = "Python Azure Health Deidentification is a managed service that enables users to tag, \
redact, or surrogate health data."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-health-deidentification-1.0.0-1.3.noarch.rpm"
RPM_HASH = "6bf5633e38fc1e12506b68c7e0f3edf980e98166fb98b08907472be891cc78aa5ef76826946fbaf5a631dd193a80e55f25ee2e185060948dd307586f6d65dedf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-health-deidentification \
python314-azure-health-deidentification \
python3dist-azure-health-deidentification"

RDEPENDS:${PN} += "-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-core \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
