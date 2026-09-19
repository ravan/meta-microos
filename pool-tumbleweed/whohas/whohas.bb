SUMMARY = "Package list querying tool"
DESCRIPTION = "whohas is a command line tool that allows querying several package lists at \
once - currently supported are Arch, Debian, Fedora, Gentoo, Mandriva, \
openSUSE, Slackware (and linuxpackages.net), Source Mage, Ubuntu, FreeBSD, \
NetBSD, OpenBSD, Fink, MacPorts, Cygwin and OpenMoko. whohas is written in Perl \
and was designed to help package maintainers find ebuilds, pkgbuilds and \
similar package definitions from other distributions to learn from. However, it \
can also be used by normal users who want to know: \
 \
 * Which distribution provides packages on which the user depends. \
 * What version of a given package is in use in each distribution, or in each \
   release of a distribution (not implemented for all distributions)."
LICENSE = "GPL-2.0-or-later"

PV = "0.29.1"

RPM_NAME = "whohas-0.29.1-1.34.noarch.rpm"
RPM_HASH = "3898d69c1ed9e5257e5d7d7db7854700bcb844226a077b32449021c080669e8e7cdf8855b0bad89f63290f86f9548dd6e96d1f599b71272e8623a763b03df934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "whohas"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-LWP--UserAgent \
perl-Thread--Queue \
perl-forks"

inherit rpm
