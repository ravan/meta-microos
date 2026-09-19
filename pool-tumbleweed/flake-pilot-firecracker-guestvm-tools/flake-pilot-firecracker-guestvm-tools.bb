SUMMARY = "FireCracker guest VM tools"
DESCRIPTION = "Guest VM tools to help with firecracker workloads"
LICENSE = "MIT"

PV = "3.1.45"

RPM_NAME = "flake-pilot-firecracker-guestvm-tools-3.1.45-1.2.aarch64.rpm"
RPM_HASH = "a06a27a351877320a38d2651c1222e304e735c1c0fdb0f735e096ce3059506ac1a63e288c657670ff89157c3d11f966e9c4e6a57e0bb6035e887b47c6a813c50"

RPROVIDES:${PN} += "flake-pilot-firecracker-guestvm-tools"

RDEPENDS:${PN} += ""

inherit rpm
