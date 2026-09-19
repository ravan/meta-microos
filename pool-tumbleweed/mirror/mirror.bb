SUMMARY = "Perl Scripts for Mirroring FTP Servers"
DESCRIPTION = "Mirror is a package written in Perl that uses the FTP protocol to duplicate \
a directory hierarchy between the machine it is run on and a remote host. It \
avoids copying files unnecessarily by comparing the file time-stamps and \
file sizes before transferring. Amongst other things, it can optionally \
rename, compress, gzip, and split files."
LICENSE = "SUSE-mirror"

PV = "2.9"

RPM_NAME = "mirror-2.9-912.14.noarch.rpm"
RPM_HASH = "c3c700fec5121fa98dfbec72672accd07a411156c9b33c9e946755c24db6cb674d1475c17452d7daa264c7a8f45f30b2f19feb4c8996ca050efdfeb58216e40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mirror"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
