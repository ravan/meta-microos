SUMMARY = "Perl extension for statvfs() and fstatvfs()"
DESCRIPTION = "Interface for statvfs() and fstatvfs() \
 \
Unless you need access to the bsize, flag, and namemax values, you should \
probably look at using Filesys::DfPortable or Filesys::Df instead. They \
will generally provide you with more functionality and portability. \
 \
The module should work with all flavors of Unix that implement the \
'statvfs()' and 'fstatvfs()' calls. This would include Linux, *BSD, HP-UX, \
AIX, Solaris, Mac OS X, Irix, Cygwin, etc ... \
 \
The 'statvfs()' and 'fstatvfs()' functions will return a list of values, or \
will return 'undef' and set '$!' if there was an error. \
 \
The values returned are described in the statvfs/fstatvfs header or the \
'statvfs()/fstatvfs()' man page. \
 \
The module assumes that if you have 'statvfs()', 'fstatvfs()' will also be \
available."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.82"

RPM_NAME = "perl-Filesys-Statvfs-0.82-1.50.aarch64.rpm"
RPM_HASH = "f314cabe4c9adb329a6e58aacfb9ff9cc2f93d27eaf50714999ca669a84b44c59ebadb88b342e24eb0ef2da93dff21cb4504a6459c32941314921d9f5f2a5964"

RPROVIDES:${PN} += "perl-Filesys--Statvfs \
perl-Filesys-Statvfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
