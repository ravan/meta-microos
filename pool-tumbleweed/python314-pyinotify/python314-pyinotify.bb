SUMMARY = "Python module for watching filesystems changes"
DESCRIPTION = "pyinotify is a Python module for watching filesystems changes. By its design \
pyinotify can be used for any kind of fs monitoring. \
 \
pyinotify relies on a recent Linux Kernel feature (merged in kernel 2.6.13) \
called inotify. inotify is an event-driven notifier, its notifications are \
exported from kernel space to user space. The raw interface of inotify is \
compounded of three system calls. pyinotify binds these system calls and \
provides an implementation on top of them offering a generic and abstract way \
to use inotify with Python. Pyinotify doesn't requires much detailed knowledge \
of inotify. Moreover, it only needs few statements for initializing, watching, \
handling (eventually trough a new separate thread), and processing events \
notifications through subclassing. The only things to know is the path of items \
to watch, the kind of events to monitor and the actions to execute on these \
notifications."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "python314-pyinotify-0.9.6-8.5.noarch.rpm"
RPM_HASH = "31804e92901bf0ccc899464d4964c9bec0a3bc6ba169b11b89d3ed66a1f7af6116a92f4722a5109113bb03b279bb8405b2882584448771d04ad8dbcc75515100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyinotify \
python314-pyinotify \
python3dist-pyinotify"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
python-abi"

inherit rpm
