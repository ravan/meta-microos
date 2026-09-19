SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdnssd-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "ac4ddeadf3b210f21b1e562d4dc3e92a01041d0890c0ab57922f741efa9e3af80a53d04f385a723b7c23d6fc9e9d2c8446ed8f578cc68c50e6a71f5d6153a874"

RPROVIDES:${PN} += "cmake-KF6DNSSD \
kf6-kdnssd-devel"

RDEPENDS:${PN} += "libKF6DNSSD6"

inherit rpm
