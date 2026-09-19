SUMMARY = "Get the native PID and the PPID on Linux"
DESCRIPTION = "Why should one use a module to get the PID and the PPID of a process where \
there are the '$$' variable and the 'getppid()' builtin ? (Not mentioning \
the equivalent 'POSIX::getpid()' and 'POSIX::getppid()' functions.) \
 \
In fact, this is useful on Linux, with multithreaded programs. Linux' C \
library, using the linux thread model, returns different values of the PID \
and the PPID from different threads. (Other thread models such as NPTL \
don't have the same behaviour). This module forces perl to call the \
underlying C functions 'getpid()' and 'getppid()'."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.04"

RPM_NAME = "perl-Linux-Pid-0.04-3.56.aarch64.rpm"
RPM_HASH = "73e65fc5c294dc28e76731446db25242b4b958414cd5fa33f1b655f530ccd591c6c9618d09d536773153c4cdeb7713cb392d570d6a058c70e384350f388196fe"

RPROVIDES:${PN} += "perl-Linux--Pid \
perl-Linux-Pid"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
