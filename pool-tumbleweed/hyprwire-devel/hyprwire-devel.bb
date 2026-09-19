SUMMARY = "Development files for hyprwire"
DESCRIPTION = "Hyprwire is a wire protocol, and its eponymous implementation. This \
is essentially a method for processes to talk to each other. \
 \
This subpackage contains headers for hyprwire."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "hyprwire-devel-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "8bddb7448c83e074fdde7a1d2fb7fea9678885d147149eb0290d7707750c79b1d6c660f2e5564032ca69d2e9e9e950fb482a491957ff868ca39c3ef8e16ba5fc"

RPROVIDES:${PN} += "cmake-hyprwire-scanner \
hyprwire-devel \
pkgconfig-hyprwire \
pkgconfig-hyprwire-scanner"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hyprwire \
libhyprwire3"

inherit rpm
