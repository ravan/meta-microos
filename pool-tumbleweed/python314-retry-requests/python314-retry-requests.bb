SUMMARY = "Make requests's sessions auto-retry on failure"
DESCRIPTION = "Make requests's sessions auto-retry on failure."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python314-retry-requests-2.0.0-1.4.noarch.rpm"
RPM_HASH = "9f4653a670eb6737c0746a67866739415a9aea9adf3ea50928f6595af1501f4518551a5c9329b364f3ae34a2f0048c0836734412baadc2eaf8d7120d20e8c71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-retry-requests \
python314-retry-requests \
python3dist-retry-requests"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-urllib3"

inherit rpm
