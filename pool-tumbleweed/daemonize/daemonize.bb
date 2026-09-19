SUMMARY = "Command line utility to run any program as a Unix daemon"
DESCRIPTION = "daemonize runs a command as a Unix daemon. As defined in W. Richard Stevens' \
1990 book, Unix Network Programming (Addison-Wesley, 1990), a daemon is 'a \
process that executes 'in the background' (i.e., without an associated \
terminal or login shell) either waiting for some event to occur, or waiting \
to perform some specified task on a periodic basis.' Upon startup, a typical \
daemon program will: \
 \
- Close all open file descriptors (especially standard input, standard output \
  and standard error) \
- Change its working directory to the root filesystem, to ensure that it \
  doesn’t tie up another filesystem and prevent it from being unmounted \
- Reset its umask value \
- Run in the background (i.e., fork) \
- Disassociate from its process group (usually a shell), to insulate itself \
  from signals (such as HUP) sent to the process group \
- Ignore all terminal I/O signals \
- Disassociate from the control terminal (and take steps not to reacquire one) \
- Handle any SIGCLD signals \
 \
Most programs that are designed to be run as daemons do that work for \
themselves. However, you’ll occasionally run across one that does not. \
When you must run a daemon program that does not properly make itself into a \
true Unix daemon, you can use daemonize to force it to run as a true daemon."
LICENSE = "BSD-3-Clause"

PV = "1.7.8"

RPM_NAME = "daemonize-1.7.8-2.5.aarch64.rpm"
RPM_HASH = "ccf1fb7cb8d1fa65b8b3980e7635f7a912d549a793dc173cd56237a970b9824402da68a1d731a19d6b70717c89de1fccd71b0534f46bdffec83ad7bc438f36bb"

RPROVIDES:${PN} += "daemonize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
