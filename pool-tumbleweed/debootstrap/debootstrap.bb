SUMMARY = "Bootstrap a basic Debian system"
DESCRIPTION = "debootstrap is used to create a Debian base system from scratch, \
without requiring the availability of dpkg or apt. It does this \
by downloading .deb files from a mirror site, and carefully \
unpacking them into a directory which can eventually be chrooted \
into."
LICENSE = "MIT"

PV = "1.0.144"

RPM_NAME = "debootstrap-1.0.144-1.2.noarch.rpm"
RPM_HASH = "879465ec6e240997e0f94423afdc94dc51b66921fb09f333f9a3692cda273665cdfca4c05d364fe43810d93881f940f5ce64dbebc900f0d49e9a7bc45e803ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "debootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
binutils \
wget"

inherit rpm
