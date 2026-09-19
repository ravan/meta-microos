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

RPM_NAME = "python313-thespian-4.0.1-1.3.noarch.rpm"
RPM_HASH = "4b09bc78218c1c9eca472a9751b35ab801ba54bbf711ba66989f7ed04e292101860af47516b4d98855cd77803db0333ef82e8952d2eb34fc4ba32bb1cb9a3a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-thespian \
python3.13dist-thespian \
python313-thespian \
python3dist-thespian"

RDEPENDS:${PN} += "python-abi \
python313-setproctitle"

inherit rpm
