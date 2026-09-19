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

RPM_NAME = "python313-locket-1.0.0-3.5.noarch.rpm"
RPM_HASH = "b8788f498bacd07a994ff0c9395c45e0cbacdfb64ad4c034ad14e8305d2e8a1f73c5e22ad322b344cf5a0f21f3953dbeffc4de88a892c0471f4fd2344fb206f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-locket \
python3.13dist-locket \
python313-locket \
python3dist-locket"

RDEPENDS:${PN} += "python-abi"

inherit rpm
