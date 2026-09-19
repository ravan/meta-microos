SUMMARY = "A Tool to Determine File Types"
DESCRIPTION = "With the file command, you can obtain information on the file type of a \
specified file. File type recognition is controlled by the file \
/etc/magic, which contains the classification criteria. This command is \
used by apsfilter to permit automatic printing of different file types."
LICENSE = "BSD-2-Clause"

PV = "5.48"

RPM_NAME = "file-5.48-2.2.aarch64.rpm"
RPM_HASH = "9ace7ed80ec176eb33862f71f305a500eae983b2adf000934872c95e8e0bb21c7d4bf0aab962619e30fa63d215fb80e0e3d598a38680a8e583250ef528f41441"

RPROVIDES:${PN} += "file"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libseccomp.so.2"

inherit rpm
