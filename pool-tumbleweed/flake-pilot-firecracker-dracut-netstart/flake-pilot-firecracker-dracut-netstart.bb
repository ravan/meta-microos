SUMMARY = "Dracut Module Network Startup"
DESCRIPTION = "Start systemd network and resolver inside of the initrd such \
that the network setup persists after switch_root if there \
is no systemd process called but sci as simple command \
execution interface"
LICENSE = "MIT"

PV = "3.1.45"

RPM_NAME = "flake-pilot-firecracker-dracut-netstart-3.1.45-1.2.noarch.rpm"
RPM_HASH = "be7a3db77c0fda55a30bff38a9bb4dfb03b996c109617d4e454c679eca4b81d685a9f4b1e09d3070e5a49918f6844e8170f7a2def1dfa4842fe9698fac9766d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-flake-pilot-firecracker-dracut-netstart \
flake-pilot-firecracker-dracut-netstart"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
