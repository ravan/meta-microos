SUMMARY = "Loadable bash builtins"
DESCRIPTION = "This package contains the examples for the ready-to-dynamic-load \
builtins found in the source tar ball of the bash: \
 \
basename      Return non-directory portion of pathname. \
 \
cut	      cut(1) replacement. \
 \
dirname       Return directory portion of pathname. \
 \
finfo	      Print file info. \
 \
getconf       POSIX.2 getconf utility. \
 \
head	      Copy first part of files. \
 \
id	      POSIX.2 user identity. \
 \
ln	      Make links. \
 \
logname       Print login name of current user. \
 \
mkdir	      Make directories. \
 \
pathchk       Check pathnames for validity and portability. \
 \
print	      Loadable ksh-93 style print builtin. \
 \
printenv      Minimal builtin clone of BSD printenv(1). \
 \
push	      Anyone remember TOPS-20? \
 \
realpath      Canonicalize pathnames, resolving symlinks. \
 \
rmdir	      Remove directory. \
 \
sleep	      sleep for fractions of a second. \
 \
strftime      Loadable builtin interface to strftime(3). \
 \
sync	      Sync the disks by forcing pending filesystem writes to \
complete. \
 \
tee	      Duplicate standard input. \
 \
tty	      Return terminal name. \
 \
uname	      Print system information. \
 \
unlink	      Remove a directory entry. \
 \
whoami	      Print out username of current user."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.15"

RPM_NAME = "bash-loadables-5.3.15-8.2.aarch64.rpm"
RPM_HASH = "9d9ab7676dffc4203678c57387caa71b1fc01e82e1932ed53f29d33412ec1071b439590ee4b74a992e881a4cdc4ddad57e9630469642f551bf2e4a0075606246"

RPROVIDES:${PN} += "bash-loadables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
