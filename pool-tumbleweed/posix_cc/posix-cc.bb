SUMMARY = "POSIX 1003.2 and 1003.1 2001 C Language Compilers"
DESCRIPTION = "c89 is the name of the C language compiler as required by the POSIX \
1003.2 standard, while c99 is the name required by the POSIX 1003.1 \
2001 standard. Both are actually wrappers for gcc, passing it the \
options required to make it conform to said standards in addition to \
the options passed via the command line. \
 \
Both will only accept those options mandated by the respective \
standards."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "posix_cc-1.4-513.22.aarch64.rpm"
RPM_HASH = "af2fe33d8e922f517813af7ac087e94be7b03ee02039ae12790b89bc72cda5c591fea96ebec9ebe573c19990aa42b15844694870676356bd7eb9ead3361f7ad5"

RPROVIDES:${PN} += "posix-cc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
