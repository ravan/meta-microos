SUMMARY = "Static archives for the SELinux runtime"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the static development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.11"

RPM_NAME = "libselinux-devel-static-3.11-2.1.aarch64.rpm"
RPM_HASH = "247271d654498635385a69a6928194ada2a2ced0d44ef2924179d686dedf20a594464f5d71f633daa1b67349af117fe411fb33516a967b8df04e1a3a61640b0a"

RPROVIDES:${PN} += "libselinux-devel-static"

RDEPENDS:${PN} += "libselinux-devel \
pkgconfig-libpcre2-8 \
pkgconfig-libsepol"

inherit rpm
