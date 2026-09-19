SUMMARY = "File-based locks for Python"
DESCRIPTION = "Locket implements a lock that can be used by multiple processes provided \
they use the same path. \
 \
Locks largely behave as (non-reentrant) `Lock` instances from the `threading` \
module in the standard library. Specifically, their behaviour is: \
 \
* Locks are uniquely identified by the file being locked, \
  both in the same process and across different processes. \
* Locks are either in a locked or unlocked state. \
* When the lock is unlocked, calling `acquire()` returns immediately and changes \
  the lock state to locked. \
* When the lock is locked, calling `acquire()` will block until the lock state \
  changes to unlocked, or until the timeout expires. \
* If a process holds a lock, any thread in that process can call `release()` to \
  change the state to unlocked. \
* Behaviour of locks after `fork` is undefined."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python314-locket-1.0.0-3.5.noarch.rpm"
RPM_HASH = "c2bf5215edb1cf77f992d8e1c7bbc161a4075c4c455551f5a9935b29c6a3d452ecce4b433fa5674876b13e0b08b6ff8e02ad8c5ec7776bb465df1be621d83824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-locket \
python314-locket \
python3dist-locket"

RDEPENDS:${PN} += "python-abi"

inherit rpm
