SUMMARY = "Uses mmap to map in a file as a Perl variable"
DESCRIPTION = "The Sys::Mmap module uses the POSIX at https://en.wikipedia.org/wiki/Mmap \
call to map in a file as a Perl variable. Memory access by mmap may be \
shared between threads or forked processes, and may be a disc file that has \
been mapped into memory. Sys::Mmap depends on your operating system \
supporting UNIX or POSIX.1b mmap, of course. \
 \
*Note* that PerlIO now defines a ':mmap' tag and presents mmap'd files as \
regular files, if that is your cup of joe. \
 \
Several processes may share one copy of the file or string, saving memory, \
and concurrently making changes to portions of the file or string. When not \
used with a file, it is an alternative to SysV shared memory. Unlike SysV \
shared memory, there are no arbitrary size limits on the shared memory \
area, and sparse memory usage is handled optimally on most modern UNIX \
implementations."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.210.0"

RPM_NAME = "perl-Sys-Mmap-0.210.0-1.4.aarch64.rpm"
RPM_HASH = "652bf21bb58995d218932aba679c4bb3e755a0ac63b105cff583c3f36965123af9e8bc0752bb2f30345ce75d3044f88e6d8491aebadd949f709afccc2c75797a"

RPROVIDES:${PN} += "perl-Sys--Mmap \
perl-Sys-Mmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
