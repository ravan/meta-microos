SUMMARY = "Python Actor concurrency library"
DESCRIPTION = "Thespian is a Python library providing a framework for developing \
concurrent, distributed, fault tolerant applications. \
 \
Thespian is built on the Actor Model which allows applications to be \
written as a group of independently executing but cooperating \
'Actors' which communicate via messages.  These Actors run within \
the Actor System provided by the Thespian library. \
 \
      * Concurrent \
      * Distributed \
      * Fault Tolerant \
      * Scalable \
      * Location independent \
 \
Actor programming is broadly applicable and it is ideally suited \
for Cloud-based applications as well, where compute nodes are \
added and removed from the environment dynamically. \
 \
   * More Information: http://thespianpy.com \
   * Release Notes: http://thespianpy.com/doc/releases.html"
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python314-thespian-4.0.1-1.3.noarch.rpm"
RPM_HASH = "fbf49134f3f23c140a1d742a654d566b71588c6f75f05c01bfe1e85cb46e66d4c8aba8f9e2cef9935593b5469aa12394e3ec4b609d9c0b200e12ffc554a09144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-thespian \
python314-thespian \
python3dist-thespian"

RDEPENDS:${PN} += "python-abi \
python314-setproctitle"

inherit rpm
