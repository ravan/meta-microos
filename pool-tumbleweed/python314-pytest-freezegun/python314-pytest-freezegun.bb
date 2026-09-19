SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python314-pytest-freezegun-0.4.2-4.5.noarch.rpm"
RPM_HASH = "4ae57cc84e5be1c4111c79f2e144acb41aa0cb569f77c666a2a896161c71bd58ff9dc38adee8a1967f8575796c5ea52f88162aa37c484a861fbf3c2485b1a14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-freezegun \
python314-pytest-freezegun \
python3dist-pytest-freezegun"

RDEPENDS:${PN} += "python-abi \
python314-freezegun \
python314-pytest"

inherit rpm
