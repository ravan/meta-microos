SUMMARY = "FireCracker pilot"
DESCRIPTION = "Launcher and service tools for KVM VM based applications \
through firecracker"
LICENSE = "MIT"

PV = "3.1.45"

RPM_NAME = "flake-pilot-firecracker-3.1.45-1.2.aarch64.rpm"
RPM_HASH = "6ad3b1fd0e32fb4278304bf4aba031ab49b9e7b4de4679b6b8625fe559553ef1cedaaafc110476a401f219fc4d27f8b9689598a0b7bcb8bfa9c89cbc40a187fb"

RPROVIDES:${PN} += "config-flake-pilot-firecracker \
flake-pilot-firecracker"

RDEPENDS:${PN} += "e2fsprogs \
firecracker \
libc.so.6 \
libgcc-s.so.1 \
rsync \
sudo \
xz"

inherit rpm
