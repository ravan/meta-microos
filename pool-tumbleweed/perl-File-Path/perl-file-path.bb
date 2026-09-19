SUMMARY = "Create or remove directory trees"
DESCRIPTION = "This module provides a convenient way to create directories of arbitrary \
depth and to delete an entire directory subtree from the filesystem."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.180000"

RPM_NAME = "perl-File-Path-2.180000-1.27.noarch.rpm"
RPM_HASH = "d4d511d7bba80adf56082e874c25cc853508a20e7dc03877aabb1ba513c0ce3705b8c7f65dfc9343cf66be32834d6a207b53a3fdc833233a351395dea149a9a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Path \
perl-File-Path"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
