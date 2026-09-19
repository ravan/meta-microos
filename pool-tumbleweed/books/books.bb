SUMMARY = "Several Linux Books"
DESCRIPTION = "This package contains some books, which are installed under \
/usr/share/doc/Books. \
 \
The books are: \
 \
'Linux Installation and getting started' by Matt Welsh \
 \
'Linux Programmers Guide' by Sven Goldt and Sven van der Meer \
 \
'Linux Network Administrators Guide, Second Edition' by Olaf Kirch and \
Terry Dawson \
 \
'Linux System Administrators Guide' by Lars Wirzenius \
 \
'Linux Users Guide' by Larry Greenfield \
 \
'Linux Kernel 2.4 Internals' by Tigran Aivazian \
 \
'The Linux Kernel Module Programming Guide' by Ori Pomerantz"
LICENSE = "GPL-2.0+ & SUSE-LDPL-2.0"

PV = "2009.1.12"

RPM_NAME = "books-2009.1.12-22.24.noarch.rpm"
RPM_HASH = "16ec063739a34ddd3dfb0877a979f11ae851d07890b81b9b1ef3d4203afe3d8176b617496bb99ab89edaa229b5f4a09765a459928ec200402fb7a5ec0c82cf00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "books \
handbuch \
lx-buch1"

RDEPENDS:${PN} += ""

inherit rpm
