SUMMARY = "Watches file system activity, such as /tmp files"
DESCRIPTION = "The tmpwatch utility recursively searches through specified directories \
and removes files which have not been accessed in a specified period of \
time. tmpwatch is normally used to clean up directories which are used \
for temporarily holding files (for example, /tmp). \
 \
There are multiple tools called 'tmpwatch', this package contains the \
Fedora/Red Hat version previously available at \
https://fedorahosted.org/tmpwatch and now hosted at \
https://pagure.io/tmpwatch"
LICENSE = "GPL-2.0-only"

PV = "2.11"

RPM_NAME = "tmpwatch-2.11-7.11.aarch64.rpm"
RPM_HASH = "8b113fc9a18c16a5e3ccd29fe58a91df75b0adf782f36b937a8533b8f6771cf9769a53c08d633d8ae4d8f4440fed02126c24629ae25b3701908baabec6fd1fd2"

RPROVIDES:${PN} += "tmpwatch"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
psmisc"

inherit rpm
