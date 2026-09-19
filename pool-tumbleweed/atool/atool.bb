SUMMARY = "Commandline Tool for Managing File Archives of various Types"
DESCRIPTION = "atool is a script for managing file archives of various types (tar, \
tar+gzip, zip, etc). \
 \
The main command is probably 'aunpack' which extracts files from an \
archive. It overcomes the dreaded 'multiple files in archive root' \
problem by first extracting to a unique subdirectory, and then moving \
back the files if possible. \
 \
aunpack also prevents local files from being overwritten by \
mistake. Other commands provided are apack (for creating archives), \
als (for listing files in archives), and acat (for extracting files to \
stdout)."
LICENSE = "GPL-2.0-or-later"

PV = "0.39.0"

RPM_NAME = "atool-0.39.0-6.3.noarch.rpm"
RPM_HASH = "1ae854a8bec7e5d781c4043f5687a0f41c0696d6d7f9f5e76d9a3491022c9d3a7ab55e1c5486b7c4098b85ff49ca61c2703901e034b279c9848a610f08cead0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atool"

RDEPENDS:${PN} += "/usr/bin/perl \
bzip2 \
gzip \
tar"

inherit rpm
