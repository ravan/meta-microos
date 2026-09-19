SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python314-retry-0.9.2-4.9.noarch.rpm"
RPM_HASH = "3261bcc697d8c965400c285a319f1d6bb085843ae912eafefd5ee1bccb242e56c7d8157bbd9887fa97336da85986a0f2ba42436075a565cca9c7dd94cf272d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-retry \
python314-retry \
python3dist-retry"

RDEPENDS:${PN} += "python-abi \
python314-decorator"

inherit rpm
