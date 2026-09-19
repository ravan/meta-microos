SUMMARY = "Encrypted bandwidth-efficient backup using the rsync algorithm"
DESCRIPTION = "Duplicity incrementally backs up files and directories by encrypting \
tar-format volumes with GnuPG and uploading them to a remote (or local) \
file server. In theory many remote backends are possible; right now \
local, ssh/scp, ftp, rsync, HSI, WebDAV, and Amazon S3 backends are \
written. \
 \
Because duplicity uses librsync, the incremental archives are space \
efficient and only record the parts of files that have changed since \
the last backup. Currently duplicity supports deleted files, full unix \
permissions, directories, symbolic links, fifos, etc., but not hard \
links."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.0.2"

RPM_NAME = "duplicity-3.2.0.2-1.1.aarch64.rpm"
RPM_HASH = "97df9ba592e67d55f1ce29c66bb453b3087ab8a27b218ab04a61066280ff64b01ed7680d63a3e96f750ff1e9b4b409fa82c42ca7db8de40d27754d90e7523d14"

RPROVIDES:${PN} += "duplicity \
python3.13dist-duplicity \
python3dist-duplicity"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
librsync.so.2 \
python-abi \
python3-fasteners \
python3-gnupg \
python3-lockfile \
python3-pexpect \
python3-ptyprocess"

inherit rpm
