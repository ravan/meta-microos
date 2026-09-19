SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python314-schedule-1.2.2-1.2.noarch.rpm"
RPM_HASH = "dc1330f3348c6126d0ce0baf99b1c9cbcb78de9958674e54172c3ecb1cf216237ecd683844b3d0a0982aa53164c0847d5a72de38aeab925ca8f06a77362c2ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-schedule \
python314-schedule \
python3dist-schedule"

RDEPENDS:${PN} += "python-abi"

inherit rpm
